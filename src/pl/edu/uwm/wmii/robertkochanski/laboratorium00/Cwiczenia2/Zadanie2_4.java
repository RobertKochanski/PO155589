package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_4 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = -3;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp++;
        }

        int max = tab[0];
        int min = tab[0];

        for(int i=1; i<n; i++){
            if(max<tab[i]){
                max = tab[i];
            }
            if(min>tab[i]){
                min = tab[i];
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
