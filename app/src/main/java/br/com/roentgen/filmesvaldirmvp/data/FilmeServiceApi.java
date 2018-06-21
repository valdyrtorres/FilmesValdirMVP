package br.com.roentgen.filmesvaldirmvp.data;

import br.com.roentgen.filmesvaldirmvp.data.model.Filme;
import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;

public interface FilmeServiceApi {

    interface FilmeServiceCallback<T> {

        void onLoaded(T filmes);
    }

    void getFilmes(FilmeServiceCallback<FilmeResultadoBusca> callback);

    void getFilme(String filmeId, FilmeServiceCallback<Filme> callback);
}