package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1b {
    public static void main(String[] args){
        String s = "abcdefcefaefbc";
        String subs = "ef";
        System.out.println("Napis s: " + s);
        System.out.println("Napis subs:" + subs);
        System.out.println("Ilość wystąpień: " + countSubStr(s, subs));
    }

    public static int countSubStr(String str, String subStr){
        int suma = 0;
        for(int i=0; i<str.length()-subStr.length()+1; i++){
            if(str.startsWith(subStr, i)){
                suma++;
            }
        }
        return suma;
    }
}
