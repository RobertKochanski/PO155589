package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_1d {
    public static void main(String[] args) {
        int[] tab =  {7,4,1,8,5,8,4,5,6,11};
        int ile = 0;

        for(int i=1; i<9; i++){
            if(tab[i] < (tab[i-1]+tab[i+1])/2){
                System.out.println(tab[i]);
                ile++;
            }
        }
        System.out.println("Suma wystąpień: "+ile);
    }
}
