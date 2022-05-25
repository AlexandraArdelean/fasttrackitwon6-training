package main.ro.fasttrackitwon6.homework.lab13;

import java.util.*;

public class DaySchedule {
    private final DayOfWeek day;
    private final List<String> activities;

    public DaySchedule(DayOfWeek day) {
        this.day = day;
        activities = new ArrayList<>();
    }

    public DayOfWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return Collections.unmodifiableList(activities);
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
