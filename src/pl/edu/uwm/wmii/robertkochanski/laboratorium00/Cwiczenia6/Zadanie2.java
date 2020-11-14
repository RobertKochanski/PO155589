package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

public class Zadanie2 {
    public static void main(String[] args){
        IntegerSet s1 = new IntegerSet();
        IntegerSet s2 = new IntegerSet();

        System.out.println("Dane:");
        for(int i=0; i<100; i++){
            s1.Set[i] = i < 8;
        }
        IntegerSet.writeSet(s1);
        for(int i=0; i<100; i++){
            s2.Set[i] = i < 11;
        }
        IntegerSet.writeSet(s2);
        System.out.print("\n");

        System.out.println("Punkt 1: union");
        IntegerSet.writeSet(IntegerSet.union(s1, s2));
        System.out.print("\n");

        System.out.println("Punkt 2: intersection");
        IntegerSet.writeSet(IntegerSet.intersection(s1, s2));
        System.out.print("\n");

        System.out.println("Punkt 3: insertElement");
        s1.insertElement(23);
        IntegerSet.writeSet(s1);
        System.out.print("\n");

        System.out.println("Punkt 4: deleteElement");
        s1.deleteElement(23);
        s2.deleteElement(9);          //sprawdzenie dla equals
        s2.deleteElement(10);         //sprawdzenie dla equals
        s2.deleteElement(11);         //sprawdzenie dla equals
        IntegerSet.writeSet(s1);
        System.out.print("\n");

        System.out.println("Punkt 5: toString");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.print("\n");

        System.out.println("Punkt 6: equals");
        System.out.println("Equals: " + s1.equals(s2));
    }
}
