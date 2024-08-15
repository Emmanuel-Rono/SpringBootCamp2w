package org.example;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
    @Override
    public void data() {
            System.out.println("org.example.Airtel Data");
    }

    @Override
    public void calling() {
            System.out.println("org.example.Airtel Calling");
    }
}
