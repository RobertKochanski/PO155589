package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie1_1g {
    public static void main(String[] args) {
        int[] tab =  {-7,-5,-3,-1,1,3,5,7,9,11};

        int solve1 = 0;
        int solve2 = 1;
        for(int i=0; i<10; i++){
            solve1 += tab[i];
            solve2 *= tab[i];
        }
        System.out.print(solve1+"\n");
        System.out.print(solve2);
    }
}
