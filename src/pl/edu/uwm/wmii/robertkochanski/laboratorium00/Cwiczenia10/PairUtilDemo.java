package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

public class PairUtilDemo {
    public static void main(String[] var0) {
        String[] var1 = new String[]{"Ala", "ma", "psa", "i", "kota"};
        Pair var2 = ArrayAlg.minmax(var1);
        System.out.println("min = " + (String)var2.getFirst());
        System.out.println("max = " + (String)var2.getSecond());
        var2 = PairUtil.swap(var2);
        System.out.println("min = " + (String)var2.getFirst());
        System.out.println("max = " + (String)var2.getSecond());
    }
}