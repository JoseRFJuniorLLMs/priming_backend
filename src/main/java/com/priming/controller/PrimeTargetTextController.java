package com.priming.controller;

import com.priming.entity.PrimeTargetTextCollection;
import com.priming.service.PrimeTargetTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prime-target-text")
public class PrimeTargetTextController {

    @Autowired
    private PrimeTargetTextService primeTargetTextService;

    @GetMapping("/find")
    public List<PrimeTargetTextCollection> findByPrimeTarget(
            @RequestParam(name = "prime") String prime,
            @RequestParam(name = "target") String target) {
        return primeTargetTextService.findByPrimeTargetText(prime, target);
    }

    @GetMapping("/find-by-target")
    public List<PrimeTargetTextCollection> findByTarget(
            @RequestParam(name = "target") String target) {
        return primeTargetTextService.findByTarget(target);
    }
}
