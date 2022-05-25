package main.ro.fasttrackitwon6.homework.lab13;

public class MainPlanner {
    public static void main(String[] args) throws NoActivitiesForDayException {
        DailyPlanner dailyPlanner = new DailyPlanner();


        dailyPlanner.addActivity(DayOfWeek.MONDAY, "go to work :(");
        dailyPlanner.addActivity(DayOfWeek.MONDAY, "go to the gym");
        dailyPlanner.addActivity(DayOfWeek.MONDAY, "make some food");
        dailyPlanner.addActivity(DayOfWeek.MONDAY, "SLEEEPPPP!!!");
        dailyPlanner.addActivity(DayOfWeek.TUESDAY, "work day again");
        dailyPlanner.addActivity(DayOfWeek.TUESDAY, "do yoga and relax");
        dailyPlanner.addActivity(DayOfWeek.WEDNESDAY, "it's almost weekend, just go to work");
        dailyPlanner.addActivity(DayOfWeek.WEDNESDAY, "sleep a little");
        dailyPlanner.addActivity(DayOfWeek.THURSDAY, "Yay, two more days of week");
        dailyPlanner.addActivity(DayOfWeek.THURSDAY, "Have a break, have a Kit-Kat");
        dailyPlanner.addActivity(DayOfWeek.FRIDAY, "Just one more day of work");
        dailyPlanner.addActivity(DayOfWeek.FRIDAY, "go to gym");
        dailyPlanner.addActivity(DayOfWeek.FRIDAY, "dancing");
        dailyPlanner.addActivity(DayOfWeek.FRIDAY, "shopping");
        dailyPlanner.addActivity(DayOfWeek.SATURDAY, "it's weekend, yayyy!!");
        dailyPlanner.addActivity(DayOfWeek.SATURDAY, "sleeping");
        dailyPlanner.addActivity(DayOfWeek.SUNDAY, "weekend it's gooooddd for the soul");
        System.out.println(dailyPlanner);

        dailyPlanner.removeActivity(DayOfWeek.FRIDAY, "dancing");
        System.out.println(dailyPlanner);
        System.out.println(dailyPlanner.getActivities(DayOfWeek.MONDAY));
        System.out.println(dailyPlanner.endPlanning());
    }
}
