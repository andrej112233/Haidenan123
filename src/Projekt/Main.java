package Projekt;

import Projekt.Student;
import Projekt.Univerzitet;
import Projekt.Zaposleni;

public class Main {
    public static void main(String[] args) {
    	
        Student student = new Student("Marko", 21, "Računarstvo");
        student.predstaviSe();

        Zaposleni zaposleni = new Zaposleni("Jovan", 30, "Profesor");
        zaposleni.predstaviSe();

        Univerzitet univerzitet = new Univerzitet("Univerzitet Crne Gore");
        univerzitet.info();
    }
}
