package com.infybuzz.Controller;

import com.infybuzz.Entity.Prime;
import com.infybuzz.Service.PrimeService;
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
@RequestMapping("/api/getPrime")
public class PrimeController {

    @Autowired
    PrimeService primeService;

    @Autowired
    private Gpt4Client gpt4Client;

    @GetMapping("/{prime}")
    public ResponseEntity<String> findByOnePrime(@PathVariable String prime) {
        List<Prime> result = primeService.getPrimeList(prime);
        try {
            String response = gpt4Client.callGpt4(result);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Erro ao chamar o GPT-3");
        }
    }

    @GetMapping("/list/{prime}")
    public ResponseEntity<List<Prime>> findByPrimeList(@PathVariable String prime) {
        List<Prime> result = primeService.getPrimeList(prime);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getTargetList/{target}")
    public ResponseEntity<List<Prime>> findByTarget(@PathVariable String target) {
        List<Prime> result = primeService.getTargetList(target);
        return ResponseEntity.ok(result);
    }
}
