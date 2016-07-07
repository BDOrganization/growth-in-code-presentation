package com.bdorganization.easilymisunderstood.typeabuse.good;

import java.util.Set;

@SuppressWarnings("javadoc")
public interface RecurringAppointment
{
    /**
     * @return they days of the week for which this appointment occurs.
     */
    Set<DayOfWeek> getWeeklyRecurrence();
}
