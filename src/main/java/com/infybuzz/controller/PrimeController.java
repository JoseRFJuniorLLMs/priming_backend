package com.infybuzz.controller;

import com.infybuzz.DTO.PrimeDTO;
import com.infybuzz.entity.Prime;
import com.infybuzz.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/GetPrime/")
public class PrimeController {

    @Autowired
    PrimeService primeService;

    @GetMapping("/getPrimeByPrime/{prime}")
    public List<Prime> getPrimeList(@PathVariable String prime) {
        return primeService.getPrime(prime);
    }

    @GetMapping("/getPrimeByPrimeDTO/{prime}")
    public List<PrimeDTO> getPrimeListDTO(@PathVariable String prime) {
        return primeService.getPrimeDTO(prime);
    }
}
