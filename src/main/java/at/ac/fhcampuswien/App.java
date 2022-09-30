package at.ac.fhcampuswien;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        String output = "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator();
        // input your solution here
        System.out.print(output);
    }

    //todo Task 3
    public void sumOfLiterals(){

        char a = 'Z';
        float b = 5.5f;
        int c = 012;
        int d = 0xface;
        long e = 80l;
        double f = 99.9;
        double g = 44e-1f;
        double h = 8.88e1;
        int sum = a + (int) b + c + d + (int) e + (int) f + (int) g + (int) h;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int  num2 = a.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap:");
        System.out.println("x: " + num1);
        System.out.println("y: " + num2);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner a = new Scanner(System.in);
        int n1 = a.nextInt();
        int n2 = a.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if (n1 == n2) {
            System.out.print("n1 == n2");
        } else if (n1 < n2) {
            System.out.print("n2 > n1");
        } else {
            System.out.print("n1 > n2");
        }

        System.out.println("");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        Scanner a = new Scanner(System.in);
        int umsatz = a.nextInt();

        if (umsatz < 0 || umsatz >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (umsatz >= 80000) {
            System.out.println("Excellent Sales Revenue");
        } else if (umsatz >= 50000) {
            System.out.println("Good Sales Revenue");
        } else if (umsatz >= 20000) {
            System.out.println("Average Sales Revenue");
        } else {
            System.out.println("Poor Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner a = new Scanner(System.in);
        int sales = a.nextInt();

        float salesProve = (float) sales / 100;

        System.out.print("Enter CommissionClass: ");

        switch (sales) {
            case 1:
                System.out.println("Your Commission Rate was set to " + salesProve);
                break;
            case 2:
                System.out.println("Your Commission Rate was set to " + salesProve);
                break;
            case 3:
                System.out.println("Your Commission Rate was set to " + salesProve);
                break;
            case 4:
                System.out.println("Your Commission Rate was set to " + salesProve);
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        Scanner a = new Scanner(System.in);
        int year = a.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}