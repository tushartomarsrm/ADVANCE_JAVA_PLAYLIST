import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // PS Q1: Creating an ArrayList and printing it using a for-each loop
        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Student 1");
        studentsList.add("Student 2");
        studentsList.add("Student 3");
        studentsList.add("Student 4");
        studentsList.add("Student 5");
        studentsList.add("Student 6");
        studentsList.add("Student 7");
        studentsList.add("Student 8");
        studentsList.add("Student 9");
        studentsList.add("Student 10");

        System.out.println("Student List:");
        for (String student : studentsList) {
            System.out.println(student);
        }

        // PS Q2: Printing time in HH:mm:ss format using Date class
        Date currentDate = new Date();
        System.out.println("\nCurrent Time (using Date class): " + String.format("%tT", currentDate));

        // PS Q3: Printing time in HH:mm:ss format using Calendar class
        Calendar calendar = Calendar.getInstance();
        System.out.println("\nCurrent Time (using Calendar class): " +
                String.format("%02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND)));

        // PS Q4: Printing time in HH:mm:ss format using java.time API
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m:s");
        String formattedTime = now.format(formatter);
        System.out.println("\nCurrent Time (using java.time API): " + formattedTime);

        // PS Q5: Creating a Set and verifying unique elements
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(5);
        numbersSet.add(6);
        numbersSet.add(46);
        numbersSet.add(60);
        numbersSet.add(9);
        numbersSet.add(6); // Duplicate element

        System.out.println("\nNumbers Set (Unique Elements Only): " + numbersSet);
    }
}
This program covers all the practice set questions. It creates an ArrayList of students, prints the current time using Date, Calendar, and java.time API, and demonstrates that only unique elements are stored in a HashSet.

Output:

sql
Copy code
Student List:
Student 1
Student 2
Student 3
Student 4
Student 5
Student 6
Student 7
Student 8
Student 9
Student 10

Current Time (using Date class): 19:03:25

Current Time (using Calendar class): 19:03:25

Current Time (using java.time API): 19:03:25

Numbers Set (Unique Elements Only): [5, 6, 9, 60, 46]