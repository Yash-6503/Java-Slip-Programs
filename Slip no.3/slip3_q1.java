import java.io.*;
import java.util.*;

public class slip3_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] cities = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }

        Arrays.sort(cities);

        System.out.println("Cities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}