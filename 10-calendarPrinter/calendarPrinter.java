import java.util.Calendar;

public class CalendarPrinter {

    public static void printCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("     ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d ", day);

            if (dayOfWeek == Calendar.SATURDAY) {
                System.out.println();
            }

            dayOfWeek = (dayOfWeek + 1) % 7;
        }
    }

    public static void main(String[] args) {
        int year = 2023; // Change to the desired year
        int month = 8;   // Change to the desired month (1 = January, 12 = December)
        
        System.out.println("Calendar for " + month + "/" + year + ":\n");
        printCalendar(year, month);
    }
}
