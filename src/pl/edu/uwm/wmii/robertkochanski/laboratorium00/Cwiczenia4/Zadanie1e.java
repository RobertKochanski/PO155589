package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1e {
    public static void main(String[] args){
        String s = "aabckjhabfds";
        String subs = "ab";
        System.out.println("Napis s: " + s);
        System.out.println("Napis subs: " + subs);
        int[] tab = where(s, subs);
        for (int j : tab) {
            System.out.print(j + " ");
        }
    }

    public static int[] where(String str, String subStr) {
        int[] tab = new int[str.split(subStr, -1).length - 1];
        int temp = 0;

        for(int i=0; i<str.length()-subStr.length()+1; i++){
            if(str.startsWith(subStr, i)){
                tab[temp] = i;
                temp++;
            }
        }
        return tab;
    }
}
