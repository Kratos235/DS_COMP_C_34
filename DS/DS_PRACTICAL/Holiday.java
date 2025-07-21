public class Holiday {

    String name = "Independence Day";
    int day = 15;
    String month = "August";


    public void printHoliday() {
        System.out.println("Holiday: "+name+", Date: "+day+" "+month);
    }

    public void checkSpecialMonth() {
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("New Year Celebration!");
                break;
            case "august":
                System.out.println("Independence Day Celebration!");
                break;
            case "december":
                System.out.println("Christmas Celebration!");
                break;
            default:
                System.out.println("No special celebration this month.");
        }
    }

}
