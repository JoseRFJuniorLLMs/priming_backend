package com.infybuzz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.infybuzz.request.Gpt4Request;

import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/gpt4")
public class Gpt4Controller {

    @Value("${gpt4.api.endpoint}")
    private String gpt4ApiEndpoint;

    @PostMapping("/generateText")
    public ResponseEntity<String> generateText(@RequestBody Gpt4Request request) {
        // Construa a entrada para a API GPT-4
        String prompt = "Palavra principal: " + request.getPrimeWord() + "\nPalavras-alvo: " + String.join(", ", request.getTargetWords());

        // Faça uma chamada para a API GPT-4
        String response = callGpt4Api(prompt);

        // Retorne a resposta
        return ResponseEntity.ok(response);
    }

    private String callGpt4Api(String prompt) {
        // Use RestTemplate to make an HTTP call to the GPT-4 API
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(gpt4ApiEndpoint, prompt, String.class);

        // Extract and return the generated text from the GPT-4 API response
        return response;
    }

}
