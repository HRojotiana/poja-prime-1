package com.hei.rojo.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import com.hei.rojo.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class PrimeController {
    @GetMapping("/new-prime")
    public BigInteger isPrime(){
        SecureRandom secureRandom = new SecureRandom();
        return BigInteger.probablePrime(10_000, secureRandom);
    }
}
