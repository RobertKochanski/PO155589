package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.ArrayList;

public class Zadanie7 {
    public static void Eratostenes(int n){
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for(int i=2; i<=n; i++){
            pierwsze.add(i);
        }
        int temp = 2;
        while(temp <= Math.sqrt(n)){
            for(int i=0; i<pierwsze.size(); i++){
                if(pierwsze.get(i) == temp){
                    continue;
                }
                if(pierwsze.get(i) % temp == 0){
                    pierwsze.remove(i);
                }
            }
            temp++;
        }
        System.out.println(pierwsze);
    }

    public static void main(String[] args) {
        int n = 100;
        Eratostenes(n);
    }
}
