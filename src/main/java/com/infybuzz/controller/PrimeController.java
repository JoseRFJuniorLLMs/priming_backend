package com.infybuzz.controller;

import com.infybuzz.entity.Prime;
import com.infybuzz.service.Gpt4Client;
import com.infybuzz.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/api/getprime")
public class PrimeController {

    @Autowired
    PrimeService primeService;

    @Autowired
    private Gpt4Client gpt4Client;

    @GetMapping("/getPrimeByPrimeList/{prime}")
    public ResponseEntity<List<Prime>> buscarPorPrime(@PathVariable String prime) {
        List<Prime> resultado = primeService.getPrime(prime);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/getPrimeByPrimeOne/{prime}")
    public ResponseEntity<String> buscarPorPrimeOne(@PathVariable String prime) {
        List<Prime> resultado = primeService.getPrime(prime);
        try {
            String response = gpt4Client.callGpt4(resultado);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao chamar a API do GPT-4");
        }
    }

    @GetMapping("/getTargetByOne/{target}")
    public ResponseEntity<List<Prime>> buscarPorTargetOne(@PathVariable String target) {
        List<Prime> resultado = primeService.getPrime(target);
        return ResponseEntity.ok(resultado);
    }
}
