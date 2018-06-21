package br.com.roentgen.filmesvaldirmvp.data;

import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitEndpoint {
    @GET("./")
    Call<FilmeResultadoBusca> busca(@Query("s") String q, @Query("r") String format);
}