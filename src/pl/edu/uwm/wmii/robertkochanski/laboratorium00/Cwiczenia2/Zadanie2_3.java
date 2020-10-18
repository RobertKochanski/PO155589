package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_3 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        int temp = -3;
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp++;
        }

        for(int i=0; i<n; i++){
            if(tab[i]>0){
                dodatnie++;
            }
            if(tab[i]==0){
                zera++;
            }
            if(tab[i]<0){
                ujemne++;
            }
        }
        System.out.println("dodatnie: "+dodatnie);
        System.out.println("ujemne: "+ujemne);
        System.out.println("zera: "+zera);
    }
}
