package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1f {
    public static void main(String[] args) {
        int[] tab = {-19, -18, 18, -17, 0, 18, -16, -15, -14, 14, -13, -12,
                11, 9, 10, 8, 7, 6, 5, -4, 3, 2, -1, 1, 0};
        for(int num: tab){
            if(num > 0){
                num = 1;
            }
            if(num < 0){
                num = -1;
            }
            System.out.print(num + " ");
        }
    }
}
