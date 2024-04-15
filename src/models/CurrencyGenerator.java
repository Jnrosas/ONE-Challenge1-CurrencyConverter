package models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyGenerator {

    public CurrencyExchangeCalculator getDataFromAPI(String currency){
        String url = "https://v6.exchangerate-api.com/v6/3b7c416aa0ff7fc58bf27a67/latest/" + currency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return new Gson().fromJson(json, CurrencyExchangeCalculator.class);
        } catch (Exception e) {
            throw new RuntimeException("\nNo encontre datos");
        }
    }
}
