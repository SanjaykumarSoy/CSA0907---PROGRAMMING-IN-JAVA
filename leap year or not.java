import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            int nextYear = year + 1;

            while (!((nextYear % 400 == 0) || (nextYear % 4 == 0 && nextYear % 100 != 0))) {
                nextYear++;
            }

            System.out.println(year + " is NOT a Leap Year.");
            System.out.println("Next Leap Year: " + nextYear);
            System.out.println("Years remaining: " + (nextYear - year));
        }

     
    }
}
