package com.bdorganization.easilymisused.collections.returntype.good;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AppointmentManager
{

    /**
     * Returns a list of the available {@link Date}s that an appointment could begin based on the date provided. If no
     * appointment begin times can be found, {@code null} will be returned.
     * 
     * @param startTime
     *            The start date. This value will be used to determine
     * @return the available begin dates.
     */
    public List<Date> getAvailableBeginTimes(Date startDate, Date endTime)
    {
        // if the appointment end date is in the future, we return a date in the future. This is not supposed to
        // represent any reasonable logic, it is just a way to flex the return value based on some criteria.
        if (endTime.after(new Date()))
        {
            return Arrays.asList(new Date(new Date().getTime() + 1000000));
        }

        return new ArrayList<>(0);
    }
}
