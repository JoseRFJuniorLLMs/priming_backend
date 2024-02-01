package com.priming.controller;

import com.priming.entity.Prime;
import com.priming.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/getPrime")
public class PrimeController {

    @Autowired
    PrimeService primeService;
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
