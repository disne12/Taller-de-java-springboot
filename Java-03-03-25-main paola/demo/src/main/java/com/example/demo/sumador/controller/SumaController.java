package com.example.demo.sumador.controller;

import com.example.demo.sumador.service.SumaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    @Autowired
    private SumaService sumaService;

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return sumaService.sumar(a, b);
    }

    @GetMapping("/sumarTres")
    public int sumarTres(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        return sumaService.sumarTres(a, b, c);
    }

    @PostMapping("/dividir")
    public double dividr(@RequestParam int a, @RequestParam int b){
        return sumaService.dividir(a, b);
    }
}
