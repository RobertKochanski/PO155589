package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1g {
    public static void main(String[] args){
        int[] tab = {-3, -1, 0, 4, 6, 8, 10, 13, 28, 30, 33};
        int lewy = 2;
        int prawy = 5;
        int[] temp = new int[prawy-lewy+1];
        int t = 0;

        for(int i = lewy; i <= prawy; i++){
            temp[t] = tab[i];
            t++;
        }
        for(int i = lewy; i <= prawy; i++){
            tab[i] = temp[t-1];
            t--;
        }
        for(int num: tab){
            System.out.print(num + " ");
        }
    }
}
