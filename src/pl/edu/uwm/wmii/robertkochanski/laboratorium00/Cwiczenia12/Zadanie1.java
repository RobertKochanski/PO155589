package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia12;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Zadanie1 {
    private static PriorityQueue<ToDoList> theList = new PriorityQueue<>();

    public static class ToDoList implements Comparable<ToDoList>{
        private int priorytet;
        private String opis;

        public ToDoList(int priorytet, String opis){
            this.priorytet = priorytet;
            this.opis = opis;
        }

        public int getPriorytet() {
            return priorytet;
        }

        public void setPriorytet(int priorytet) {
            this.priorytet = priorytet;
        }

        public String getOpis() {
            return opis;
        }

        public void setOpis(String opis) {
            this.opis = opis;
        }

        @Override
        public int compareTo(ToDoList o) {
            return Integer.compare(priorytet, o.getPriorytet());
        }
    }

    public static void showTasks(){
        for(ToDoList tdl: theList){
            System.out.println(tdl.getPriorytet() + " - " + tdl.getOpis());
        }
    }

    public static void main(String[] args) {
        boolean x = true;
        while(x){
            String wejscie = "";
            Scanner s1 = new Scanner(System.in);
            if(s1.hasNextLine()){
                wejscie = s1.nextLine();
            }
            wejscie = wejscie.substring(0, 1).toUpperCase() + wejscie.substring(1).toLowerCase();
            String[] wejscie_split = wejscie.split(" ");
            switch (wejscie_split[0]) {
                case "Dodaj" -> {
                    int priority = Integer.parseInt(wejscie_split[1]);
                    StringBuilder description = new StringBuilder();
                    for (int i = 2; i < wejscie_split.length; i++) {
                        if (i == 2) description.append(wejscie_split[i]);
                        else description.append(" ").append(wejscie_split[i]);
                    }
                    ToDoList toDoTask = new ToDoList(priority, description.toString());
                    theList.add(toDoTask);
                }
                case "Nastepne" -> theList.poll();
                case "Zakoncz" -> x = false;
            }
            showTasks();
        }
    }
}
