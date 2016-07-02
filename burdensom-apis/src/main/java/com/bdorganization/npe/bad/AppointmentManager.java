package com.bdorganization.npe.bad;

import com.bdorganization.npe.common.Appointment;
import com.bdorganization.npe.common.AppointmentRemoveStatus;
import com.bdorganization.npe.common.AppointmentRemoveStatus.Status;

@SuppressWarnings({ "javadoc", "nls" })
public class AppointmentManager
{
    /*
     * In this situation, it might not make sense to be so restrictive. While it is likely that there is some error
     * happening along the process that causes the provided appointment to be null, is it really worth terminating a
     * work-flow of the consumer and potentially user just for removing an appointment? This can't be answered in a
     * blanket statement, but it should always be considered.
     */
    public AppointmentRemoveStatus removeAppointment(Appointment appointment)
    {
        if (appointment == null)
        {
            throw new NullPointerException("appointment cannot be null");
        }

        // ... removal code
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}
