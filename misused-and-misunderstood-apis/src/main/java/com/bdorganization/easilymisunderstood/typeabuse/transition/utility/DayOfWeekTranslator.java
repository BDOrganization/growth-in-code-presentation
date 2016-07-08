package com.bdorganization.easilymisunderstood.typeabuse.transition.utility;

import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.FRIDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.MONDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.SATURDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.SUNDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.THURSDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.TUESDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.WEDNESDAY;

import java.util.HashSet;
import java.util.Set;

import com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek;

@SuppressWarnings({ "javadoc", "nls" })
public class DayOfWeekTranslator
{

    public Set<DayOfWeek> translateDaysOfWeek(Set<Integer> daysOfWeek)
    {
        Set<DayOfWeek> listToReturn = new HashSet<DayOfWeek>(daysOfWeek.size());

        for (Integer singleDayOfWeek : daysOfWeek)
        {
            listToReturn.add(translateDayOfWeek(singleDayOfWeek));
        }

        return listToReturn;
    }

    public DayOfWeek translateDayOfWeek(int dayOfWeek)
    {
        switch (dayOfWeek)
        {
            case 0:
                return (SUNDAY);
            case 1:
                return (MONDAY);
            case 2:
                return (TUESDAY);
            case 3:
                return (WEDNESDAY);
            case 4:
                return (THURSDAY);
            case 5:
                return (FRIDAY);
            case 6:
                return (SATURDAY);
            default:
                throw new RuntimeException("Unrecognized day of week");
        }
    }
}
