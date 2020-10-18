package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie1_1e {
    public static void main(String[] args) {
        int[] tab =  {-7,-5,-3,-1,1,3,5,7,9,11};

        int solve = 1;
        for(int i=0; i<10; i++){
            if(tab[i]<0){
                tab[i] = -tab[i];
            }
            solve *= tab[i];
        }
        System.out.print(solve);
    }
}
