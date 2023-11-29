package com.infybuzz.service;

import com.google.gson.Gson;
import com.infybuzz.entity.Prime;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
@Service
public class Gpt4Client {

    private final OkHttpClient httpClient = new OkHttpClient();
    private final Gson gson = new Gson();
    private final String apiKey = "SEU_TOKEN_AQUI";

    public String callGpt4(List<Prime> primes) throws IOException {
        String jsonBody = gson.toJson(Map.of(
                "prompt", buildPrompt(primes),
                "max_tokens", 100
        ));

        RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/engines/text-davinci-003/completions")
                .addHeader("Authorization", "Bearer " + apiKey)
                .post(body)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String responseBody = response.body().string();
            // Aqui você pode deserializar a resposta e retornar o que precisa
            return responseBody;
        }
    }

    private String buildPrompt(List<Prime> primes) {
        // Implemente a lógica para construir o prompt a partir de seus Primes
        return "Aqui vai o prompt construído a partir de seus dados";
    }
}
