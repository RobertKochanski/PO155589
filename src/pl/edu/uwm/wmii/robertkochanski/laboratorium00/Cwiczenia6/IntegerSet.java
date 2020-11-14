package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

class IntegerSet {
    boolean[] Set = new boolean[100];

    public static void writeSet(boolean[] set) {
        for (int i = 0; i < 100; i++) {
            if (set[i])
                System.out.print(i+1 + ", ");
        }
        System.out.println();
    }

    public static boolean[] union(boolean[] s1, boolean[] s2){
        boolean[] us = new boolean[100];
        for(int i=0; i<100; i++){
            us[i] = s1[i] || s2[i];
        }
        return us;
    }

    public static boolean[] intersection(boolean[] s1, boolean[] s2){
        boolean[] us = new boolean[100];
        for(int i=0; i<100; i++){
            us[i] = s1[i] && s2[i];
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

    public boolean equals(Object object){
        if(!(object instanceof IntegerSet)) return false;
        IntegerSet x = (IntegerSet) object;
        if(Set.length != x.Set.length) return false;
        for(int i = 0; i < Set.length; i++){
            if(Set[i] != x.Set[i]) return false;
        }
        return true;
    }
}
