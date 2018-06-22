package br.com.roentgen.filmesvaldirmvp.filmes;

import android.support.annotation.NonNull;

import java.util.List;

import br.com.roentgen.filmesvaldirmvp.data.model.Filme;

/*
  Definição do contrato
 */

public interface FilmesContract {

    interface View {
        void setCarregando(boolean isAtivo);

        void exibirFilmes(List<Filme> filme);

        void exibirDetalhesUI (String filmeId);
    }

    interface UserActionsListener {

        void carregarFilmes();

        void abrirDetalhes(@NonNull Filme filme);
    }
}
