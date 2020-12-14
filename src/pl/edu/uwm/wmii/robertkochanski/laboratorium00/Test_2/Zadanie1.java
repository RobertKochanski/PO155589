package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Test_2;

import pl.imiajd.Kochanski.test_2.Komputer;
import pl.imiajd.Kochanski.test_2.Laptop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie1 {
    public static void main(String[] args) {
        ArrayList<Komputer> grupa = new ArrayList<>();
        grupa.add(new Komputer("Komputer1", LocalDate.of(2019, 3, 13)));
        grupa.add(new Komputer("Komputer2", LocalDate.of(2020, 1, 1)));
        grupa.add(new Komputer("Komputer1", LocalDate.of(2018, 12, 24)));
        grupa.add(new Komputer("Komputer4", LocalDate.of(2000, 7, 27)));
        grupa.add(new Komputer("Komputer3", LocalDate.of(2020, 1, 1)));

        System.out.println("Przed sortowaniem");
        for(Komputer komputer : grupa){
            System.out.println(komputer.toString());
        }

        Collections.sort(grupa);
        System.out.println();

        System.out.println("Po sortowaniu");
        for(Komputer komputer : grupa){
            System.out.println(komputer.toString());
        }

        System.out.println();System.out.println("########################################");System.out.println();

        ArrayList<Laptop> grupaLaptopow = new ArrayList<>();
        grupaLaptopow.add(new Laptop("Laptop1", LocalDate.of(2019, 3, 13), true));
        grupaLaptopow.add(new Laptop("Laptop2", LocalDate.of(2020, 1, 1), false));
        grupaLaptopow.add(new Laptop("Laptop1", LocalDate.of(2018, 12, 24), false));
        grupaLaptopow.add(new Laptop("Laptop4", LocalDate.of(2000, 7, 27), false));
        grupaLaptopow.add(new Laptop("Laptop3", LocalDate.of(2020, 1, 1), true));

        System.out.println("Przed sortowaniem");
        for(Laptop laptop : grupaLaptopow){
            System.out.println(laptop.toString());
        }

        Collections.sort(grupaLaptopow);
        System.out.println();

        System.out.println("Po sortowaniu");
        for(Laptop laptop : grupaLaptopow){
            System.out.println(laptop.toString());
        }
    }
}
