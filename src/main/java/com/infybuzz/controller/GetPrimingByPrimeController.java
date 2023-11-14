package com.infybuzz.controller;

import com.infybuzz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.infybuzz.request.Gpt4Request;

import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/GetPrimingByPrime")
public class GetPrimingByPrimeController {

  /*

    @GetMapping("/search/{primeParam}")
    public String searchNodes(@PathVariable String primeParam) {
        String cypherQuery = "WITH $param AS Prime " +
                "MATCH (n:priming) " +
                "WHERE n.Prime = Prime OR n.Target = Prime " +
                "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
                "RETURN n, Prime, Target";

        // Executa a consulta com o parâmetro fornecido
        var result = neo4jTemplate.getCypherOperations().query(cypherQuery)
                .bind(primeParam).to("param")
                .fetch();

        return result.toString();
    }

   */
}
