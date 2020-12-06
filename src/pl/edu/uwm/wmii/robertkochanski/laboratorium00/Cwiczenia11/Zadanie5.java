package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.ArrayList;
import java.util.Stack;

public class Zadanie5 {
    public static void reverse(String str){
        ArrayList<Stack<String>> stosy = new ArrayList<>();
        Stack<String> stos = new Stack<>();
        StringBuilder slowo = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c == ' '){
                if(slowo.length() > 0){
                    stos.add(slowo.toString());
                    slowo = new StringBuilder();
                }
                continue;
            }
            if(c == '.'){
                if(slowo.length() > 0){
                    stos.add(slowo.toString());
                    slowo = new StringBuilder();
                }
                stosy.add(stos);
                stos = new Stack<>();
                continue;
            }
            slowo.append(c);
        }
        for(int i = 0; i < stosy.size(); i++){
            boolean CzyPierwszy = true;
            while(!stosy.get(i).empty()){
                if(CzyPierwszy){
                    CzyPierwszy = false;
                    String PierwszeSlowo = stosy.get(i).pop();
                    PierwszeSlowo = PierwszeSlowo.substring(0, 1).toUpperCase() + PierwszeSlowo.substring(1).toLowerCase();
                    System.out.print(PierwszeSlowo);
                }
                else{
                    System.out.print(stosy.get(i).pop().toLowerCase());
                }
                if(stosy.get(i).size() == 0){
                    System.out.print(".");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i < stosy.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args){
        String s = "Ala ma kota. Jej kot lubi myszy.";
        System.out.println(s);
        reverse(s);
    }
}
