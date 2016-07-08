package com.bdorganization.easilymisunderstood.typeabuse.transition.extramethod;

import java.util.Set;

import com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek;

/**
 * In this situation, we are able to actually change the RecurringAppointment class. In this situation, if it is going
 * to require a lot of effort to update consumers (if we are lucky enough to even know who they are), then we need to
 * deprecate the method and point them to use the new method that uses the DayOfWeek enumeration.
 * 
 * To do this correctly, you should use the method level deprecation annotation as well as the javadoc annotation. MAKE
 * SURE that you provide consumers with an alternative method to call by specifying it after the javadoc deprecated
 * annotation.
 * 
 * Pros:
 * <ul>
 * <li>you do not have to update all consumers right now</li>
 * <li>new consumers can still use the "good" API and not have to use the type abusing one</li>
 * <li>the approach for handling the translation is centralized</li> RecurringAppointment</li>
 * </ul>
 * 
 * Cons:
 * <ul>
 * <li>you have to be able to modify the jar providing the API (this assumes that you own it)</li>
 * <li>The API that you are now using is a bit more cluttered. RecurringAppointment now has the "getWeeklyRecurrence"
 * and the "getWeeklyRecurrenceAsSet" method. The "good" method name (getWeeklyRecurrence) is already taken.</li>
 * </ul>
 */
@SuppressWarnings({ "javadoc" })
public class Consumer
{
    @SuppressWarnings("deprecation")
    public void consume(RecurringAppointment appointment)
    {
        // Existing consumers will have this. Eclipse puts a strike through this and makes it look ugly
        String recurrence = appointment.getWeeklyRecurrence();
        System.out.println(recurrence);

        // we also have access to the new method now though
        Set<DayOfWeek> recurrenceSet = appointment.getWeeklyRecurrenceAsSet();
        System.out.println(recurrenceSet);
    }
}
