package javaapplication35;

import java.util.ArrayList;

public  class  JavaApplication35<T> {

    static ArrayList<String> strArray = new ArrayList<>();
    static ArrayList<Integer> intArray = new ArrayList<>();

    public static void printArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));
        }
    }
    public static void printArray2(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));
        }
    }
    
    public static <T> void printArray3(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));
        }
    }
    
    

    public static void main(String[] args) {
        strArray.add("God");
        strArray.add("Mat");
        strArray.add("Snart");
        
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        
        
        printArray3(strArray);
        printArray3(intArray);
    }

}
