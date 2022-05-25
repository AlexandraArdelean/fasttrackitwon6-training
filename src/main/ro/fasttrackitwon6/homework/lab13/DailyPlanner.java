package main.ro.fasttrackitwon6.homework.lab13;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private final List<DaySchedule> dailySchedules;

    public DailyPlanner() {
        this.dailySchedules = new ArrayList<>();
    }


    public void addActivity(DayOfWeek day, String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
        for (DaySchedule daySchedule : dailySchedules) {
            if (daySchedule.getDay() == day) {
                daySchedule.addActivity(activity);
                return;
            }
        }
        DaySchedule newDailySchedule = new DaySchedule(day);
        newDailySchedule.addActivity(activity);
        dailySchedules.add(newDailySchedule);
    }

    public void removeActivity(DayOfWeek day, String activity) {
        if (activity == null) {
            throw new NoActivityException();
        } else {
            for (DaySchedule daySchedule : dailySchedules) {
                if (daySchedule.getDay() == day) {
                    daySchedule.removeActivity(activity);
                }
            }
        }
    }

    public List<String> getActivities(DayOfWeek day) {
        List<String> result = new ArrayList<>();
        for (DaySchedule daySchedule : dailySchedules) {
            if (daySchedule.getDay() == day) {
                result = daySchedule.getActivities();
            }
        }
        return result;
    }

    public Map<DayOfWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
        if (dailySchedules.size() != DayOfWeek.values().length) {
            throw new NoActivitiesForDayException();
        }
        Map<DayOfWeek, List<String>> plan = new HashMap<>();
        for (DaySchedule daySchedule : dailySchedules) {
            plan.put(daySchedule.getDay(), daySchedule.getActivities());
        }
        return plan;
    }


    @Override
    public String toString() {
        return "DailyPlanner{" +
                "dailySchedules=" + dailySchedules +
                '}';
    }
}

