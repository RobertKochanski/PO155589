package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args){
        int m = 3;
        int n = 3;
        int k = 2;

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];

        Random random = new Random();

        System.out.println("Macierz A:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = random.nextInt(3-1)+1;
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Macierz B:");
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                b[i][j] = random.nextInt(3-1)+1;
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Macierz C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for(int x = 0 ; x < n; x++){
                    c[i][j] += a[i][x] * b[x][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
