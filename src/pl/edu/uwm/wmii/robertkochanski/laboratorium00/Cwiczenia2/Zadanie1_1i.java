package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie1_1i {

    static double silnia(int n){
        int silnia=1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            silnia *= i;
        }
        return silnia;
    }

    public static void main(String[] args) {
        int[] tab =  {-7,-5,-3,-1,1,3,5,7,9,11};

        double solve = 0;
        for(int i=0; i<10; i++){
            if(i%2==1){
                solve += (tab[i]/silnia(i));
            }
            if(i%2==0){
                solve -= (tab[i]/silnia(i));
            }
        }
        System.out.print(solve);
    }
}
