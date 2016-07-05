package com.bdorganization.easilymisused.collections.returntype.bad;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class AppointmentManager
{

    /**
     * Returns a collection of the available {@link Date}s that an appointment could begin based on the date provided. If no
     * appointment begin times can be found, {@code null} will be returned.
     * 
     * @param startTime
     *            The start date. This value will be used to determine
     * @return the available begin dates.
     */
    public Collection<Date> getAvailableBeginTimes(Date startDate, Date endTime)
    {
        // if the appointment end date is in the future, we return a date in the future. This is not supposed to
        // represent any reasonable logic, it is just a way to flex the return value based on some criteria.
        if (endTime.after(new Date()))
        {
            return Arrays.asList(new Date(new Date().getTime() + 1000000));
        }

        return null;
    }
}
