package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println(" ---- Oefening 1 ---- ");

        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0) {
                System.out.println("result : " + i);
            }
        }

        System.out.println(" ---- Oefening 2 ---- ");

        int x = 100;
        while (x >= 50) {
            System.out.println("Number : " + x);
            x--;
        }

        System.out.println(" ---- Oefening 3 ---- ");

        int age = 0;
        do {
            System.out.println("Name: Gabriel Age: " + age);
            age++;
        } while (age < 22);

        System.out.println("Loops - Oefenreeks 1");
        System.out.println(" ---- Deel 1 ---- ");

        System.out.println("---- Oefening 1 ----");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("---- Oefening 2 ----");

        for (int star = 1; star < 5; star++) {
            System.out.println("**********");
        }

        System.out.println(" ---- Deel 2 ---- ");
        System.out.println("For Loop");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println("While Loop");
        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("Do While Loop");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);

        System.out.println("For Loop");
        for (int star = 1; star < 5; star++) {
            System.out.println("**********");
        }

        System.out.println("While Loop");
        int star = 1;

        while (star < 5) {
            System.out.println("**********");
            star++;
        }

        System.out.println("Do While Loop");
        int ster = 1;
        do {
            System.out.println("**********");
            ster++;
        } while (ster < 5);
    }
}
