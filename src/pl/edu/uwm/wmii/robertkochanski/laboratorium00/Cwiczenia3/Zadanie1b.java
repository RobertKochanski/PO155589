package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

    public class Zadanie1b {
        public static void main(String[] args){
            int[] tab = {-19,-18, 18, -17, -16, -15, -14, 14, -13, -12,
                         11, 9, 10, 8 , 7, 6, 5, -4, 3, 2, 1, 0};
            int dodatnie = 0;
            int ujemne = 0;
            int zerowe = 0;

            for(int num : tab) {
                if(num > 0) {
                    dodatnie++;
                }
                if(num == 0) {
                    zerowe++;
                }
                if(num < 0){
                    ujemne++;
                }
            }
            System.out.println("Liczby dodatnie: "+ dodatnie);
            System.out.println("Liczby zerowe: "+ zerowe);
            System.out.println("Liczby ujemne: "+ ujemne);
        }
    }
