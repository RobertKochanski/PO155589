package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_5 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = -3;
        int ile = 0;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp++;
        }

        for(int i=0; i<n-1; i++){
            if(tab[i]>0 && tab[i+1]>0){
                System.out.println(tab[i]+" "+tab[i+1]);
                ile++;
            }
        }
        System.out.print("ilosc wystapien: "+ile);
    }
}
