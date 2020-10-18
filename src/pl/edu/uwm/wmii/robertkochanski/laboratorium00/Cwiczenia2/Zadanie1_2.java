package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie1_2 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = -10;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp += 3;
        }
        for(int i=0;i<n-1;i++){
            System.out.print(tab[i+1] + " ");
        }
        System.out.print(tab[0]);
    }
}
