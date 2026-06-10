package ss1_introduction.Show_greetings;

import java.util.Scanner;

public class Show_greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}

