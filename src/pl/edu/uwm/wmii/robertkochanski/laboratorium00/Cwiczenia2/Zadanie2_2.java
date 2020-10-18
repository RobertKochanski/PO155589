package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_2 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = -3;
        int suma = 0;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp++;
        }

        for(int i=0; i<n; i++){
            if(tab[i]>0){
                suma += tab[i]*2;
            }
        }
        System.out.print(suma);
    }
}
