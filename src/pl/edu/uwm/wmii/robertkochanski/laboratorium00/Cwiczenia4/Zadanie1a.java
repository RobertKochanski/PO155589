package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1a {
    public static void main(String[] args){
        String s = "abcdefcabc";
        char c = 'b';
        System.out.println("Napis: " + s);
        System.out.println("Znak: " + c);
        System.out.println("Ilość wystąpień znaku: " + countChar(s, c));
    }

    public static int countChar(String str, char c){
        int suma = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                suma++;
            }
        }
        return suma;
    }
}


