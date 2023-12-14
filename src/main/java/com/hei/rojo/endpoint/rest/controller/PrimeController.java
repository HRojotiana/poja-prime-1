package com.hei.rojo.endpoint.rest.controller;

import static java.util.UUID.randomUUID;

import com.hei.rojo.PojaGenerated;
import com.hei.rojo.endpoint.event.EventProducer;
import com.hei.rojo.endpoint.event.gen.UuidCreated;
import com.hei.rojo.repository.DummyRepository;
import com.hei.rojo.repository.DummyUuidRepository;
import com.hei.rojo.repository.model.Dummy;
import com.hei.rojo.repository.model.DummyUuid;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class PrimeController {
    DummyRepository dummyRepository;
    DummyUuidRepository dummyUuidRepository;
    EventProducer eventProducer;

    @GetMapping("/new-prime")
    public BigInteger isPrime(){
        Random random = new Random();
        return BigInteger.probablePrime(64, random);
    }
}
