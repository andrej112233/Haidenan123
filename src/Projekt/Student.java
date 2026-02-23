package Projekt;

import Projekt.Osoba;

class Student extends Osoba {
    String smjer;

    public Student(String ime, int godine, String smjer) {
        super(ime, godine);
        this.smjer = smjer;
    }

    @Override
    public void predstaviSe() {
        System.out.println("Ja sam student " + ime + ", imam " + godine + " godina i studiram " + smjer + ".");
    }
}
