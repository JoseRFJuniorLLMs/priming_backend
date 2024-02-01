package com.priming.controller;

import com.priming.entity.PrimeTargetCollection;
import com.priming.service.PrimeTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prime-target")
public class PrimeTargetController {

    @Autowired
    private PrimeTargetService primeTargetService;

    @GetMapping("/find")
    public List<PrimeTargetCollection> findByPrimeAndTarget(
            @RequestParam(name = "prime") String prime,
            @RequestParam(name = "target") String target) {
        return primeTargetService.findByPrimeAndTarget(prime, target);
    }

    @GetMapping("/find-by-target")
    public List<PrimeTargetCollection> findByTarget(
            @RequestParam(name = "target") String target) {
        return primeTargetService.findByTarget(target);
    }
}
