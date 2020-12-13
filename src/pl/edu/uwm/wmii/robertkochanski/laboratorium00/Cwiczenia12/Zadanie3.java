package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadanie3 {
    private static Map<Student, String> studenci = new TreeMap<>();

    public static void dodaj(String imie, String nazwisko, String ocena){
        imie = imie.substring(0, 1).toUpperCase() + imie.substring(1).toLowerCase();
        nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
        Student student = new Student(imie, nazwisko);
        studenci.put(student, ocena);
    }

    public static void usun(int id){
        for(Map.Entry<Student, String> map : studenci.entrySet()){
            Student student = map.getKey();
            if(student.getId() == id){
                studenci.remove(student);
                return;
            }
        }
    }

    public static void zmien(int id, String nowaOcena){
        for(Map.Entry<Student, String> map : studenci.entrySet()){
            Student student = map.getKey();
            if(student.getId() == id){
                studenci.replace(student, nowaOcena);
            }
        }
    }

    public static void wypisz(){
        for(Map.Entry<Student, String> map : studenci.entrySet()){
            Student student = map.getKey();
            String ocena = map.getValue();
            System.out.println("id: " + student.getId() + ", " + student.getImie() + " " + student.getNazwisko() +
                               ", ocena: " + ocena);
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
                case "Dodaj" -> dodaj(wejscie_split[1], wejscie_split[2], wejscie_split[3]);
                case "Usun" -> usun(Integer.parseInt(wejscie_split[1]));
                case "Zmien" -> zmien(Integer.parseInt(wejscie_split[1]), wejscie_split[2]);
                case "Wypisz" -> wypisz();
                case "Zakoncz" -> b = false;
            }
        }
    }

    public static class Student implements Comparable<Student>{

        private static int tempId = 0;

        private int id;
        private String imie;
        private String nazwisko;

        public Student(String imie, String nazwisko) {
            this.id = ++tempId;
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public int getId() {
            return id;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        @Override
        public int compareTo(Student o){
            if(nazwisko.equalsIgnoreCase(o.getNazwisko())){
                if(imie.equalsIgnoreCase(o.getImie())){
                    return Integer.compare(id, o.getId());
                }
                return imie.compareTo(o.getImie());
            }
            return nazwisko.compareTo(o.getNazwisko());
        }
    }
}
