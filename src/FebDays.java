public class FebDays {
    public static void main(String[] args) {
        if (args.length > 0) {
            int year = Integer.parseInt(args[0]);
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
        }
    }
}
