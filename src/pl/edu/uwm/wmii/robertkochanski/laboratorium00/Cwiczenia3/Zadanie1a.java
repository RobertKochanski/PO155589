package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1a {
    public static void main(String[] args){
        int[] tab = {-19,-18, 18, -17, -16, -15, -14, 14, -13, -12,
                     11, 9, 10, 8 , 7, 6, 5, -4, 3, 2, 1, 0};
        int count1 = 0;
        int count2 = 0;

        for (int num : tab) {
            if (num % 2 == 0) {
                count1++;
            }
            if (num % 2 != 0) {
                count2++;
            }
        }
        System.out.println("Liczby parzyste: "+ count1);
        System.out.println("Liczby nieparzyste: "+ count2);
    }
}
