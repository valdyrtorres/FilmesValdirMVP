package br.com.roentgen.filmesvaldirmvp;

import br.com.roentgen.filmesvaldirmvp.data.FilmeServiceApi;
import br.com.roentgen.filmesvaldirmvp.data.model.Filme;
import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;

/*
   Para não dependermos de condições de internet não utilizamos a FilmeServiceImpl.java,
   por isso classe FakeFilmeServiceImpl.java foi criada no package de testes unitários
   implementando FilmeServiceApi
 */
public class FakeFilmeServiceImpl implements FilmeServiceApi {

    private static final FilmeResultadoBusca FILMES_SERVICE_DATA = new FilmeResultadoBusca();
    private static final Filme SINGLE_FILME_SERVICE_DATA = new Filme();


    @Override
    public void getFilmes(final FilmeServiceCallback<FilmeResultadoBusca> callback) {
        callback.onLoaded(FILMES_SERVICE_DATA);
    }

    @Override
    public void getFilme(final String filmeId, FilmeServiceCallback<Filme> callback) {
        callback.onLoaded(SINGLE_FILME_SERVICE_DATA);
    }
}