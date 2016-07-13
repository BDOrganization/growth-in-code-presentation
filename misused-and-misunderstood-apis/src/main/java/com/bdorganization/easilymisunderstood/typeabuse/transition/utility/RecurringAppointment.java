package com.bdorganization.easilymisunderstood.typeabuse.transition.utility;

@SuppressWarnings("javadoc")
public interface RecurringAppointment
{
    /**
     * @return a string representing the days of the week. For the day of the week that the recurrence is on, an 'X'
     *         character will be present. For days of the week that there is no recurrence, a space character will be
     *         present.
     * 
     *         Ex: " XXXXX " (Monday - Friday)
     * 
     *         Ex: " X X XX" (Mon/Wed/Fri/Sat)
     */
    String getWeeklyRecurrence();
}
