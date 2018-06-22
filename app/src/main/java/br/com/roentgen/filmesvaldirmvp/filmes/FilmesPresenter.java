package br.com.roentgen.filmesvaldirmvp.filmes;

import android.support.annotation.NonNull;

import br.com.roentgen.filmesvaldirmvp.data.FilmeServiceApi;
import br.com.roentgen.filmesvaldirmvp.data.model.Filme;
import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;

/*
  Implementação do contrato
 */

public class FilmesPresenter implements FilmesContract.UserActionsListener {
    private final FilmeServiceApi mApi;
    private final FilmesContract.View mFilmesView;

    /*
      As interfaces (contratos) são passadas por meio do construtor
     */
    public FilmesPresenter(FilmeServiceApi api, FilmesContract.View filmesView) {
        mApi = api;
        mFilmesView = filmesView;
    }

    @Override
    public void carregarFilmes() {
        mFilmesView.setCarregando(true);

        mApi.getFilmes(new FilmeServiceApi.FilmeServiceCallback<FilmeResultadoBusca>(){
            @Override
            public void onLoaded(FilmeResultadoBusca resultadoBusca) {
                mFilmesView.setCarregando(false);
                mFilmesView.exibirFilmes(resultadoBusca.filmes);
            }
        });
    }

    @Override
    public void abrirDetalhes(@NonNull Filme filme) {

    }
}