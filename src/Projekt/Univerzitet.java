package Projekt;

import Projekt.Organizacija;

class Univerzitet extends Organizacija {
    public Univerzitet(String naziv) {
        super(naziv);
    }

    @Override
    public void info() {
        System.out.println("Univerzitet: " + naziv);
    }
}


