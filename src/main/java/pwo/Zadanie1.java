/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pwo;

/**
 *
 * @author student
 */
public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";
    public static final String FILE_NAME2 = "Lucasseq100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FILE_NAME);
                
        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
        
        
        System.out.println("Lucas wersja 1");
        
        boolean ok2 = SequenceTools.writeToFile2(
                new LucasGenerator(), FROM, TO, FILE_NAME2);
                
        if (ok2) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME2);
        } else {
            System.out.println("Błąd");
        }
      
    }
}
