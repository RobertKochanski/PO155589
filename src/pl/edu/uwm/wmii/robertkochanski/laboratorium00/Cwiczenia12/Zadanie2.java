package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia12;

import java.util.*;
import java.util.Map.Entry;

public class Zadanie2 {
    private static Map<String, String> studenci = new TreeMap<>();

    public static void dodaj(String nazwisko, String ocena){
        nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
        studenci.put(nazwisko, ocena);
    }

    public static void usun(String nazwisko){
        nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
        studenci.remove(nazwisko);
    }

    public static void zmien(String nazwisko, String nowaOcena){
        nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
        studenci.replace(nazwisko, nowaOcena);
    }

    public static void wypisz(){
        Set<Entry<String, String>> entrySet = studenci.entrySet();
        for(Entry<String, String> entry: entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        boolean b = true;
        while(b){
            String wejscie = "";
            Scanner s1 = new Scanner(System.in);
            if(s1.hasNextLine()){
                wejscie = s1.nextLine();
            }
            wejscie = wejscie.substring(0, 1).toUpperCase() + wejscie.substring(1).toLowerCase();
            String[] wejscie_split = wejscie.split(" ");
            switch (wejscie_split[0]) {
                case "Dodaj" -> dodaj(wejscie_split[1], wejscie_split[2]);
                case "Usun" -> usun(wejscie_split[1]);
                case "Zmien" -> zmien(wejscie_split[1], wejscie_split[2]);
                case "Wypisz" -> wypisz();
                case "Zakoncz" -> b = false;
            }
        }
    }
}
