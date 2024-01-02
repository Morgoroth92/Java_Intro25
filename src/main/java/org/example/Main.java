package org.example;

public class Main {
    public static void main(String[] args) {
    charArray(50);
    }
    public static void charArray(int dimensione){
        char[] array = new char[dimensione];
        for (int i = 0; i < dimensione; i++) {
            array[i] = (char)(Math.random() * 97 + 'a');
            if (array[i] == 'a' || array[i] == '0'){
                System.out.println("Il carattere A o 0 è presente all'indice: " + i);
        }
        }
    }
}