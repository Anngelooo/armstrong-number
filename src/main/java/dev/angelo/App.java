package dev.angelo;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmrstrongChecker checker = new AmrstrongChecker();

        System.out.print("Ingrese un número para verificar si es un número de Armstrong: ");
        int number = scanner.nextInt();

        if (checker.isArmstrong(number)) {
            System.out.println(number + " es un número de Armstrong.");
        } else {
            System.out.println(number + " no es un número de Armstrong.");
        }

        scanner.close();
    }

}
