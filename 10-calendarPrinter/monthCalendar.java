import java.util.Scanner;

public class MonthCalendar {

    public static void main(String[] args) {
        int month, year =2022;
        Scanner sc = new Scanner(System.in);
        int startDayOfMonth = 6;
        int spaces = startDayOfMonth;

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter month [1-12]: ");
        month = sc.nextInt();

        if(month <= 0 || month >12){
            System.out.println("Invalid Month");
            System.exit(0);
        }else{

            for (int M = 1; M <= 12; M++) {

                    spaces = (days[M - 1] + spaces) % 7;

                    if (M == month) {
                        System.out.println("          " + months[M] + " " + year);
                        // Display the lines
                        System.out.println("_____________________________________");
                        System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");
                        // print the calendar
                        for (int i = 0; i < spaces; i++)
                            System.out.print("     ");
                        for (int i = 1; i <= days[M]; i++) {
                            System.out.printf(" %3d ", i);
                            if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
                        }
                    }
                }

        }
    }
}