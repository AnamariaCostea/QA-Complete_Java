import java.util.Scanner;
public class FebruaryDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between 1900 and 2016: ");
        int year = scanner.nextInt();
        if (year >= 1900 && year <= 2016) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println("February has 29 days in the year " + year);
            } else {
                System.out.println("February has 28 days in the year " + year);
            }
        } else {
            System.out.println("The year entered is not in the range 1900-2016.");
           }
        scanner.close();
    }
}

