package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Kolos;

public class Zadanie2 {
    public static void main(String[] args){
        String str = "Ala ma kotammm filemona";
        char c = 'm';
        System.out.println(delete(str, c));
    }

    public static String delete(String str, char c){
        char[] wynik = str.toCharArray();
        int temp = 1;
        for(int i=0; i<wynik.length; i++){
            if(wynik[i] == c && temp <= 0){
                wynik[i] = 0;
            }
            if(wynik[i] == c){
                temp--;
            }
        }
        return String.valueOf(wynik);
    }
}
