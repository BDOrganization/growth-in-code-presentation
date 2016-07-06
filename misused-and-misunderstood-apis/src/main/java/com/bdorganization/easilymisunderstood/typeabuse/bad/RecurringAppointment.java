package com.bdorganization.easilymisunderstood.typeabuse.bad;

public interface RecurringAppointment
{
    /**
     * @return string representing the days of the week. For the day of the week that the recurrence is on, an 'X'
     *         character will be present. For days of the week that there is no recurrence, a space character will be
     *         present.
     */
    String weeklyRecurrence();
}
