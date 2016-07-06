package com.bdorganization.easilymisunderstood.typeabuse.bad.more;

import java.util.List;

public interface RecurringAppointment
{
    /*
     * This is bad because there is still the decision as to what index we would start with. Should we start with 0 or
     * 1?
     * 
     * Argument for 0: most of java is 0 based, Arrays, enum ordinals, etc.
     * 
     * Argument for 1: 1st day of week makes more sense then 0th, Calendar and JODA-TIME do a starting value of 1.
     */

    /**
     * @return the list of days of the week in which an appointment should happen.
     */
    List<Long> weeklyRecurrence();
}
