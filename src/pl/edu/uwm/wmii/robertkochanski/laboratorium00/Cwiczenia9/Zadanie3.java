package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3{

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        try{
            File plik = new File("src/pl/edu/uwm/wmii/robertkochanski/laboratorium00/Cwiczenia9/Zadanie3.txt");
            Scanner scanner = new Scanner(plik);
            while(scanner.hasNextLine()){
                a.add(scanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        a.sort(String::compareTo);
        for(String s : a){
            System.out.println(s);
        }
    }
}