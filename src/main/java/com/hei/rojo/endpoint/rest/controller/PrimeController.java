package com.hei.rojo.endpoint.rest.controller;

import java.math.BigInteger;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;

public class PrimeController {
    @GetMapping("/new-prime")
    public BigInteger isPrime(){
        Random random = new Random();
        return BigInteger.probablePrime(10_000, random);
    }
}
