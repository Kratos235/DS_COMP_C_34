import java.util.Scanner;

public class LAB_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        Holiday[] holidays = createHolidayArray(size);
        printHolidayArray(holidays);
        Holiday h1 = new Holiday();
        Holiday h2 = new Holiday();
        h1.name = "Republic Day";
        System.out.println("are h1 and h2 in same month? " + inSameMonth(h1, h2));
        h2.checkSpecialMonth();
        int i=0;
        holidays[0].month = "January";
        holidays[size-2].month = "December";
        do {
            if(holidays[i].month.equals("January")) {
                i++;
                continue;
            }
            if(holidays[i].month.equals("December")) {
                break;
            }
            holidays[i].printHoliday();
            i++;
        } while(i < holidays.length);

    }

    public static boolean inSameMonth(Holiday h1, Holiday h2) {
        if(h1.month.equals(h2.month)) {
            return true;
        } else {
            return false;
        }
    }

    public static Holiday[] createHolidayArray(int size) {
        Holiday[] holidays = new Holiday[size];
        for(int i = 0; i < size; i++) {
            holidays[i] = new Holiday();
        }
        return holidays;
    }

    public static void printHolidayArray(Holiday[] holidays) {
        int i = 0;
        while(i<holidays.length) {
            holidays[i].printHoliday();
            i++;
        }
    }

}
