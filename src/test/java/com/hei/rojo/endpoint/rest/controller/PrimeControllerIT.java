package com.hei.rojo.endpoint.rest.controller;

import com.hei.rojo.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeControllerIT extends FacadeIT {
    @Autowired PrimeController primeController;

    @Test
    void isPrimeTest() {
        BigInteger primeNumber = primeController.isPrime();
        assertTrue(primeNumber.isProbablePrime(100), "Number is not a prime number");
    }
}
