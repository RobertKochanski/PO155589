package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1e {
    public static void main(String[] args) {
        int[] tab = {-19, -18, 18, -17, 18, -16, -15, -14, 14, -13, -12,
                     11, 9, 10, 8, 7, 6, 5, -4, 3, 2, -1, 1, 0};
        int max = 0;
        int obecnie = 0;

        for(int num: tab){
            if(num >= 0){
                obecnie++;
            }
            if(num < 0){
                if(max < obecnie){
                    max = obecnie;
                }
                obecnie = 0;
            }

        }
        System.out.println("Najdłuższy fragment: " + max);
    }
}
