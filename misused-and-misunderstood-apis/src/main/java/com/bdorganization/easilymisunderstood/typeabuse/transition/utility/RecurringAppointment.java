package com.bdorganization.easilymisunderstood.typeabuse.transition.utility;

import java.util.Set;

@SuppressWarnings("javadoc")
public interface RecurringAppointment {
    /**
     * @return the set of days of the week in which an appointment should happen.
     */
    Set<Integer> getWeeklyRecurrence();
}
