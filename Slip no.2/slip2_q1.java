import java.io.*;
import java.util.*;

public class slip2_q1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide the First Name, Last Name, weight (in kgs), and height (in meters) as command line arguments.");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);

        double bmi = weight / (height * height);

        System.out.println(firstName + " " + lastName + "'s BMI index is: " + bmi);
    }
}