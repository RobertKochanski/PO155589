package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1c {
    public static void main(String[] args) {
        int[] tab = {-19, -18, 18, -17, 18, -16, -15, -14, 14, -13, -12,
                     11, 9, 10, -8, 7, 6, 5, -4, 3, 2, 1, 1, 0};
        int najwieksza = tab[0];
        int ile = 0;

        for(int num: tab){
            if(najwieksza < num){
                najwieksza = num;
            }
        }
        for(int num: tab){
            if(najwieksza == num){
                ile++;
            }
        }
        System.out.println("Największa: " + najwieksza);
        System.out.println("Ilość wystąpień: " + ile);
    }
}
