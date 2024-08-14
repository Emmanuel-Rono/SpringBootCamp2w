package org.example;

public class Vodafone  implements  Sim
{

    @Override
    public void data() {
        System.out.println("Vodafone Data");

    }

    @Override
    public void calling() {
        System.out.println("Vodafone Calling");

    }


}
