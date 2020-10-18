package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia2;

public class Zadanie2_1e {
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

    static double potega(int y){
        int p=1;
        for(int i=0; i<y; i++){
            p *= 2;
        }
        return p;
    }

    public static void main(String[] args) {
        int[] tab =  {7,4,1,9,17,8,4,5,6,11};
        int ile = 0;

        for(int i=0; i<9; i++){
            if(tab[i] > potega(i) && tab[i] < silnia(i)){
                System.out.println(tab[i]);
                ile++;
            }
        }
        System.out.println("Suma wystąpień: "+ile);
    }
}

