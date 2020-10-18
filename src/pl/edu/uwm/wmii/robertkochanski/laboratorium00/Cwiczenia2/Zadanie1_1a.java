package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie1_1a {
    public static void main(String[] args){
        int[] tab =  {-7,-5,-3,-1,1,3,5,7,9,11};

        int sum = 0;
        for(int i=0; i<10; i++){
            sum += tab[i];
        }
        System.out.print(sum);
    }
}
