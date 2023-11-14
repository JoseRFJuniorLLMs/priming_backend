package com.infybuzz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/gpt4")
public class Gpt4Controller {

    @Value("${gpt4.api.endpoint}")
    private String gpt3ApiEndpoint;
    @PostMapping("/generateText")
    public ResponseEntity<String> generateText(@RequestBody Gpt3Request request) {
        // Construa a entrada para a API GPT-4
        String prompt = "Palavra principal: " + request.getPrimeWord() + "\nPalavras-alvo: " + String.join(", ", request.getTargetWords());

        // Faça uma chamada para a API GPT-4
        String response = callGpt3Api(prompt);

        // Retorne a resposta
        return ResponseEntity.ok(response);
    }

    private String callGpt3Api(String prompt) {
        // Use RestTemplate para fazer uma chamada HTTP para a API GPT-3
        RestTemplate restTemplate = new RestTemplate();
        Gpt3Response gpt3Response = restTemplate.postForObject(gpt3ApiEndpoint, new Gpt3Request(prompt), Gpt3Response.class);

        // Extraia e retorne o texto gerado pela API GPT-3
        return gpt3Response.getText();
    }
}
