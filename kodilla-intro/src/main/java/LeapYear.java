public class LeapYear {

    private static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year;
        year = 2019;
        if (leapYear(year)) {
            System.out.println("This is leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
