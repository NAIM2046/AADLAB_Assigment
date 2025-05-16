package ASP;

import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivities(List<Activity> activity) {
        activity.sort(Comparator.comparingInt(a -> a.end));
        int lestEndTime = 0;
        for (Activity act : activity) {
            if (act.start >= lestEndTime) {
                System.out.print(act.name + " ");
                lestEndTime = act.end;
            }
        }

    }
}
