package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_1a {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = 0;
        int ile = 0;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp++;
        }
        for(int i=0; i<n; i++){
            if(tab[i]%2!=0){
                ile++;
            }
        }
        System.out.println("Suma wystąpień: " + ile);
    }
}
