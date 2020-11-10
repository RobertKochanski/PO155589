package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Kolos;

public class Zadanie1 {
    public static void main(String[] args){
        zadanie1(5);
    }

    public static void zadanie1(int n){
        int wieksze=0;
        int mniejsze=0;
        int rowne=0;
        int temp=-15;
        int[] tab = new int[n];

        for(int i=0; i<n; i++){
            tab[i] = temp;
            temp += 10;
        }
        for(int i=0; i<n; i++){
            if(tab[i]>5) wieksze++;
            if(tab[i]<-5) mniejsze++;
            if(tab[i]==-5) rowne++;
        }

        System.out.println(wieksze);
        System.out.println(mniejsze);
        System.out.println(rowne);
    }
}
