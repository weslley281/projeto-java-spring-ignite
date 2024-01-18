package br.com.weslleyferraz.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiroController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id){
        return "O parametro recebido é " + id;
    }
    @GetMapping("/metodoComQueryParams")
    public String metodoQueryParams(@RequestParam String busca){
        return "O item buscado é " + busca;
    }
    @GetMapping("/metodoComQueryParams")
    public String metodoQueryParams2(@RequestParam Map<String, String> allParams){
        return "O item buscado é " + allParams.entrySet();
    }
}
