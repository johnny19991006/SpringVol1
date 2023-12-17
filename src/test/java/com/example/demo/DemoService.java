package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @TimeTrace
    public void methodToBeTraced() {
        // Your business logic here
        try {
            Thread.sleep(1000); // Simulating some time-consuming operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodWithoutTrace() {
        // Your business logic here
    }
}
