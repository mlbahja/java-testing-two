
import java.time.*;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.time.format.DateTimeParseException;

public class DayOfWeekFinder {

    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        try {
            var a = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            var date = LocalDate.parse(startDate);
            System.out.println(" =====> " + dayOfWeek);
            int index = 0;
            
            for (int i = 1; i < a.length; i++) {
                if ((a[i]).toString().equals(dayOfWeek)) {
                    index = i;

                }
            }

            //LocalDate startDate = LocalDate.now();
            System.out.println("Event Schedule:");
            for (int i = 0; i < 7; i++) {
                var eventDate = date.plusDays(i * 7);
                System.out.println("Event " + (i + 1) + ": " + eventDate);
            }



            //  System.out.println("=====> " +dayOfWeek);
            System.out.println("=====> " + date + "   -- " + date.plusDays(index));

            // var dayOfWeek = LocalDate.dayOfWeek(dayOfWeek);
        } catch (Exception e) {

        }
        return "Error";
    }

    public static void main(String[] args) {
        DayOfWeekFinder finder = new DayOfWeekFinder();

        // Test case 1
        String startDate1 = "2023-06-22";
        String dayOfWeek1 = "Monday";
        System.out.println("Next " + dayOfWeek1 + " after " + startDate1 + ": " + finder.findNextDayOfWeek(startDate1, dayOfWeek1));
        //Next Monday after 2023-06-22: 2023-06-26
        // // Test case 2
        // String startDate2 = "2023-06-22";
        // String dayOfWeek2 = "Friday";
        // System.out.println("Next " + dayOfWeek2 + " after " + startDate2 + ": " + finder.findNextDayOfWeek(startDate2, dayOfWeek2));

        // // Test case 3
        // String startDate3 = "2023-06-22";
        // String dayOfWeek3 = "Sunday";
        // System.out.println("Next " + dayOfWeek3 + " after " + startDate3 + ": " + finder.findNextDayOfWeek(startDate3, dayOfWeek3));
        // // Error case: invalid date format
        // String startDate4 = "invalid-date";
        // String dayOfWeek4 = "Monday";
        // System.out.println("Next " + dayOfWeek4 + " after " + startDate4 + ": " + finder.findNextDayOfWeek(startDate4, dayOfWeek4));
        // // Error case: invalid day of the week
        // String startDate5 = "2023-06-22";
        // String dayOfWeek5 = "Funday";
        // System.out.println("Next " + dayOfWeek5 + " after " + startDate5 + ": " + finder.findNextDayOfWeek(startDate5, dayOfWeek5));
    }
}
