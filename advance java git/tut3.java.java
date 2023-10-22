public class TutorialConcepts {

    // Method to find and return the maximum element in an array
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // 1. Using a switch statement
        String vari = "Saurabh";
        switch (vari) {
            case "Shubham" -> System.out.println("Case 1 executed");
            case "Saurabh" -> System.out.println("Saurabh");
            case "Vishaka" -> System.out.println("Vishaka");
            default -> System.out.println("Default case");
        }

        // 2. Using loops
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        int j = 0;
        do {
            System.out.println("Do-while loop executed at least once");
            j++;
        } while (j < 0);

        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                break;
            }
            System.out.println("For loop iteration: " + k);
        }

        // 3. Using arrays
        int[] marks = {100, 60, 90, 80, 70};
        for (int mark : marks) {
            System.out.println("Mark: " + mark);
        }

        // 4. Using a 2D array
        int[][] flats = new int[2][3];
        flats[0][1] = 102;

        for (int[] floor : flats) {
            for (int flat : floor) {
                System.out.println("Flat: " + flat);
            }
        }

        // 5. Calling a static method
        int[] arr3 = {1, 2100, 3, 455, 5, 34, 67};
        int maxElement = findMax(arr3);
        System.out.println("Maximum element: " + maxElement);

        // 6. Using floorDiv from Math class
        int x = -25, y = 3;
        System.out.println(Math.floorDiv(x, y));
    }
}
