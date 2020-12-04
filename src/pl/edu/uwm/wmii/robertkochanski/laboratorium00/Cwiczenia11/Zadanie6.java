package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.Stack;

public class Zadanie6 {
    public static void cyfry(int x){
        Stack<Integer> stos = new Stack<>();
        while(x > 0){
            stos.push(x%10);
            x /= 10;
        }
        int temp = stos.size();
        while(temp > 0){
            System.out.print(stos.get(temp-1) + " ");
            temp--;
        }
    }

    public static void main(String[] args) {
        cyfry(2015);
    }
}
