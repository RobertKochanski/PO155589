package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1f {
    public static void main(String[] args){
        String s = "Ala Ma KotA";
        System.out.println(change(s));
    }

    public static String change(String str){
        char[] a = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] -= 32;
            } else if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] += 32;
            }
        }
        str = String.valueOf(a);
        return str;
    }
}
