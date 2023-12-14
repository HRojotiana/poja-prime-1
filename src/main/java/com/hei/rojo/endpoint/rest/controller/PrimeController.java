package com.hei.rojo.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.web.bind.annotation.GetMapping;

public class PrimeController {
    @GetMapping("/new-prime")
    public BigInteger isPrime(){
        SecureRandom secureRandom = new SecureRandom();
        return BigInteger.probablePrime(10_000, secureRandom);
    }
}
