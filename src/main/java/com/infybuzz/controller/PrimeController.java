package com.infybuzz.controller;

import com.infybuzz.entity.Prime;
import com.infybuzz.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/GetPrime")
public class PrimeController {

    @Autowired
    PrimeService primeService;

    @GetMapping("/getPrimeByPrimeList/{prime}")
    public ResponseEntity<List<Prime>> buscarPorPrime(@PathVariable String prime) {
        List<Prime> resultado = primeService.getPrime(prime);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/getPrimeByPrimeOne/{prime}")
    public ResponseEntity<List<Prime>> buscarPorPrimeOne(@PathVariable String prime) {
        List<Prime> resultado = primeService.getPrime(prime);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/getTargetByOne/{target}")
    public ResponseEntity<List<Prime>> buscarPorTargetOne(@PathVariable String target) {
        List<Prime> resultado = primeService.getPrime(target);
        return ResponseEntity.ok(resultado);
    }
}
