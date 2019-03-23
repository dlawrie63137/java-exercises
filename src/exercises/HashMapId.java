package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by DLawrie
 */
public class HashMapId {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentId;
        String studentName;

        System.out.println("Enter your student ID (or enter ID of 0 to finish):");

        // Get student ID and name
        do {

            System.out.print("Student ID: ");
            newStudentId = in.nextInt();

            // Read in the newline before looping back
            in.nextLine();

            if (!newStudentId.equals(0)) {
                System.out.print("Student Name: ");
                studentName = in.nextLine();
                students.put(newStudentId, studentName);

                // Read in the newline before looping back
                //in.nextLine();
            }

        } while (!newStudentId.equals(0));


        // Print class roster
        System.out.println("\nClass roster:");
        System.out.println("\n");
        System.out.println("\nID     Name");
        System.out.println("---------------");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + "     " + student.getValue());
        }
    }
}
