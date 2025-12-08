import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    private int roomTemp = 0;
    private int capacity = 0;
    private int size = 0;
    ArrayList<String> classes = new ArrayList<>();
   
   

    public Classroom(int startroomTemp, int initialCapacity, int fullsize){
        roomTemp = startroomTemp;
        capacity = initialCapacity;
        size = fullsize;

    }

    public String addPerson(String names) {
        String nameessString = "";
        classes.add(name);
        System.out.println(classes);
        names = name;
    }

    public int increaseTemp(int temp) {
        return 1;
    }

    public String emptyClass(String name) {
        return null;
    }
}
