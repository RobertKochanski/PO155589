package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia9;

import pl.imiajd.Kochanski.Cwiczenia9.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {

        ArrayList<Student> grupa = new ArrayList<>();

        grupa.add(new Student("Kochański", LocalDate.of(1999, 7, 26), 3.4));
        grupa.add(new Student("Nowak", LocalDate.of(2000, 8, 13), 4.1));
        grupa.add(new Student("Kowalski", LocalDate.of(2000, 8, 13), 4.44));
        grupa.add(new Student("Godek", LocalDate.of(1999, 7, 26), 4.1));
        grupa.add(new Student("Kowalski", LocalDate.of(1998, 2, 4), 5));

        for (Student s : grupa) {
            System.out.println(s);
        }

        System.out.print("\n");

        grupa.sort(Student::compareTo);

        for (Student s : grupa) {
            System.out.println(s);
        }
    }
}







