package com.bdorganization.easilymisunderstood.typeabuse.transition.wrapper;

import java.util.HashSet;
import java.util.Set;

import static com.bdorganization.easilymisunderstood.typeabuse.transition.wrapper.DayOfWeek.*;

@SuppressWarnings({ "javadoc" })
public class RecurringAppointmentWrapper
{
    private final RecurringAppointment recurringAppointment;

    public RecurringAppointmentWrapper(RecurringAppointment recurringAppointment)
    {
        this.recurringAppointment = recurringAppointment;
    }

    public long getAppointmentId()
    {
        return recurringAppointment.getAppointmentId();
    }

    /*
     * In this scenario, the RecurringAppointment was not a class that we could change. It is unfortunate, because it
     * would be nice to provide a better API. Given that we are not able to do that, one option would be to wrap the
     * RecurringAppointment class and re-define the API to not abuse string types.
     * 
     * Benefits:
     * 
     * - we can create a new API that doesn't abuse types, resulting in less confusion and most likely less defects
     * 
     * - if the functionality that we're wrapping is significantly large, and we do not have the time to change it right
     * now, this approach allows consumers to have a good API to interact with while not requiring a massive investment
     * in refactoring. It is a good approach of deferring debt while not creating a larger mess to deal with in the
     * future.
     * 
     * 
     * Downsides:
     * 
     * - we will have to proxy any additional methods that RecurringAppointment specifies that we will need to use.
     * 
     * - while our usage of this class could be limited to RecurringAppointmentWrapper, if we are passing this class on
     * to any additional APIs that require a RecurringAppointment, we will have to add a method to get back to the
     * RecurringAppointment from the RecurringAppointmentWrapper
     * 
     * - Usually naming is difficult for these classes. Wrapper does not usually give the best description and usually
     * the good name is taken by the class/interface with the bad API.
     */
    public Set<DayOfWeek> getWeeklyRecurrence()
    {
        Set<DayOfWeek> daysOfWeekToReturn = new HashSet<DayOfWeek>();
        String recurrence = recurringAppointment.getWeeklyRecurrence();
        for (int i = 0; i < recurrence.length(); i++)
        {
            char recurrenceChar = recurrence.charAt(i);
            if (recurrenceChar != 'X')
            {
                continue;
            }

            switch (i)
            {
                case 0:
                    daysOfWeekToReturn.add(SUNDAY);
                    break;
                case 1:
                    daysOfWeekToReturn.add(MONDAY);
                    break;
                case 2:
                    daysOfWeekToReturn.add(TUESDAY);
                    break;
                case 3:
                    daysOfWeekToReturn.add(WEDNESDAY);
                    break;
                case 4:
                    daysOfWeekToReturn.add(THURSDAY);
                    break;
                case 5:
                    daysOfWeekToReturn.add(FRIDAY);
                    break;
                case 6:
                    daysOfWeekToReturn.add(SATURDAY);
                    break;
            }
        }
        return daysOfWeekToReturn;
    }
}
