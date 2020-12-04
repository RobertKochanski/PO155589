package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair){
        Pair<T> p = new Pair<>();
        p.setFirst(pair.getSecond());
        p.setSecond(pair.getFirst());
        return p;
    }
}
