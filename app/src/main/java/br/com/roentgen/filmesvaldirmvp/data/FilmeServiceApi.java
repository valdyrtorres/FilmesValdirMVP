package br.com.roentgen.filmesvaldirmvp.data;

import br.com.roentgen.filmesvaldirmvp.data.model.Filme;
import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;

/*
   contrato da API responsável por fornecer os dados utilizados no aplicativo
 */

public interface FilmeServiceApi {

    interface FilmeServiceCallback<T> {

        void onLoaded(T filmes);
    }

    void getFilmes(FilmeServiceCallback<FilmeResultadoBusca> callback);

    void getFilme(String filmeId, FilmeServiceCallback<Filme> callback);
}