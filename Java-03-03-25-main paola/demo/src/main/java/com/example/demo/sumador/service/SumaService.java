package com.example.demo.sumador.service;

import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumarTres(int a, int b, int c) {
        return a + b + c;
    }

    public double dividir(int a, int b){
        return (double) a / b;
    }


}
