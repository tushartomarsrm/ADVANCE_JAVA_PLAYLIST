import java.util.Random;

public class Tut15To25 {
    public static void main(String[] args) {
        // Using a switch statement
        String vari = "Saurabh";
        switch (vari) {
            case "Shubham" -> {
                System.out.println("Shubham");
                System.out.println("Case 1 executed");
            }
            case "Saurabh" -> System.out.println("Saurabh");
            case "Vishaka" -> System.out.println("Vishaka");
            default -> System.out.println("Default case");
        }

        // Using a while loop
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // Using a do-while loop
        int j = 0;
        do {
            System.out.println("Do-while loop executed at least once");
            j++;
        } while (j < 0);

        // Using a for loop
        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                break;
            }
            System.out.println("For loop iteration: " + k);
        }

        // Using arrays
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 90;
        marks[3] = 80;
        marks[4] = 70;

        for (int mark : marks) {
            System.out.println("Mark: " + mark);
        }

        int[] marks2 = {98, 45, 79, 99, 80};

        for (int mark : marks2) {
            System.out.println("Mark2: " + mark);
        }

        // Using Random class
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random number between 0 and 9: " + randomNumber);
    }
}
