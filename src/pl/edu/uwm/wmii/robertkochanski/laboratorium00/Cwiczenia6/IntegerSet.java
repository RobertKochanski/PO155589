package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

import java.util.Arrays;

class IntegerSet {
    boolean[] Set = new boolean[100];

    public static void writeSet(IntegerSet set) {
        for (int i = 0; i < 100; i++) {
            if (set.Set[i])
                System.out.print(i+1 + ", ");
        }
        System.out.println();
    }

    public static IntegerSet union(IntegerSet s1, IntegerSet s2){
        IntegerSet us = new IntegerSet();
        for(int i=0; i<100; i++){
            us.Set[i] = s1.Set[i] || s2.Set[i];
        }
        return us;
    }

    public static IntegerSet intersection(IntegerSet s1, IntegerSet s2){
        IntegerSet us = new IntegerSet();
        for(int i=0; i<100; i++){
            us.Set[i] = s1.Set[i] && s2.Set[i];
        }
        return us;
    }

    public void insertElement(int i){
        Set[i-1] = true;
    }

    public void deleteElement(int i){
        Set[i-1] = false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Set.length; i++){
            if(Set[i]) sb.append(i + 1).append(" ");
        }
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return Arrays.equals(Set, that.Set);
    }

}
