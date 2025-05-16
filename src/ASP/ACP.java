package ASP;

import java.util.ArrayList;
import java.util.List;

public class ACP {
    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 4, 'A'));
        activities.add(new Activity(3, 5, 'B'));
        activities.add(new Activity(0, 6, 'C'));
        activities.add(new Activity(5, 7, 'D'));
        activities.add(new Activity(8, 9, 'E'));
        activities.add(new Activity(5, 9, 'E'));
        ActivitySelection obj = new ActivitySelection();
        obj.selectActivities(activities);
    }
}
