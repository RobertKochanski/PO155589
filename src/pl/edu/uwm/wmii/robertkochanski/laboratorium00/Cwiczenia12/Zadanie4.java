package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Zadanie4 {
    private static HashMap<Integer, HashSet<String>> hashMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        String s;
        Scanner scanner = new Scanner(new File("src/pl/edu/uwm/wmii/robertkochanski/laboratorium00/Cwiczenia12/Zadanie4.txt"));
        while(scanner.hasNextLine()){
            s = scanner.nextLine();
            String[] s_split = s.split(" ");
            for(String word: s_split){
                int h = word.hashCode();
                if(hashMap.containsKey(h)){
                    hashMap.get(h).add(word + " ");
                }
                else{
                    HashSet<String> set = new HashSet<>();
                    set.add(word);
                    hashMap.put(h, set);
                }
            }
        }

        for(HashMap.Entry<Integer, HashSet<String>> entry: hashMap.entrySet()){
            HashSet<String> set = entry.getValue();
            if(set.size() >= 2){
                System.out.println(set);
            }
        }
    }
}
