package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

public class PairDemo{
    public static void main(String[] var0) {
        String[] var1 = new String[]{"Ala", "ma", "psa", "i", "kota"};
        Pair var2 = ArrayAlg.minmax(var1);
        System.out.println("min = " + (String)var2.getFirst());
        System.out.println("max = " + (String)var2.getSecond());
        var2.swap();
        System.out.println("min = " + (String)var2.getFirst());
        System.out.println("max = " + (String)var2.getSecond());
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] var0) {
        if (var0 != null && var0.length != 0) {
            String var1 = var0[0];
            String var2 = var0[0];

            for(int var3 = 1; var3 < var0.length; ++var3) {
                if (var1.compareTo(var0[var3]) > 0) {
                    var1 = var0[var3];
                }

                if (var2.compareTo(var0[var3]) < 0) {
                    var2 = var0[var3];
                }
            }

            return new Pair(var1, var2);
        } else {
            return null;
        }
    }
}
