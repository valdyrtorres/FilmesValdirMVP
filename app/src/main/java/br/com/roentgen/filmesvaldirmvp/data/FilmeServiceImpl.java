package br.com.roentgen.filmesvaldirmvp.data;

import br.com.roentgen.filmesvaldirmvp.data.model.Filme;
import br.com.roentgen.filmesvaldirmvp.data.model.FilmeResultadoBusca;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* Implementação de FilmeServiceApi */
public class FilmeServiceImpl implements FilmeServiceApi {
    RetrofitEndpoint mRetrofit;

    public FilmeServiceImpl(){
        mRetrofit = RetrofitClient.getClient().create(RetrofitEndpoint.class);
    }

    @Override
    public void getFilmes(final FilmeServiceCallback<FilmeResultadoBusca> callback) {
//        Call<FilmeResultadoBusca> callFilme = mRetrofit.busca("star wars","json");
        Call<FilmeResultadoBusca> callFilme = mRetrofit.busca("star wars","json", "c235fd18");
        callFilme.enqueue(new Callback<FilmeResultadoBusca>() {
            @Override
            public void onResponse(Call<FilmeResultadoBusca> call, Response<FilmeResultadoBusca> response) {
                if(response.code()==200){
                    FilmeResultadoBusca resultadoBusca = response.body();
                    callback.onLoaded(resultadoBusca);
                }
            }

            @Override
            public void onFailure(Call<FilmeResultadoBusca> call, Throwable t) {

            }
        });

    }

    @Override
    public void getFilme(final String filmeId, FilmeServiceCallback<Filme> callback) {

    }
}