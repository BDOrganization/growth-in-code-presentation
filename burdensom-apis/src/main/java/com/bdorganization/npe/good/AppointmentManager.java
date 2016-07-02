package com.bdorganization.npe.good;

import java.util.List;

import com.bdorganization.npe.common.Appointment;
import com.bdorganization.npe.common.AppointmentRemoveStatus;
import com.bdorganization.npe.common.AppointmentRemoveStatus.Status;

@SuppressWarnings({ "javadoc", "nls" })
public class AppointmentManager
{
    /*
     * In this situation, we are returning success for this appointment removal. While it doesn't necessary mean that an
     * appointment was removed, there are a couple of things to consider:
     * 
     * - This approach helps to prevent stopping some kind of user interaction from being blocked.
     * 
     * - Perhaps the source of the appointment for the consumer indicates that it could be null. In that case this could
     * save some verbosity for consumers. (which would cause growth and confusion in the code)
     * 
     * - If you consider the semantics of it, as a producer of the remove appointment functionality, the consumer is
     * asking you to remove "null" or nothing. Technically, you are successful at that.
     */
    public AppointmentRemoveStatus removeAppointment(Appointment appointment)
    {
        if (appointment == null)
        {
            return new AppointmentRemoveStatus(Status.SUCCESS);
        }

        // ... removal code
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }

    /*
     * The same arguments hold true here as well.
     * 
     * - This approach helps to prevent stopping some kind of user interaction from being blocked.
     * 
     * - The source of the list of appointments could be returning an empty list to represent that there are no
     * appointments that are applicable. If that's the case, then we are saving the consumer some verbosity because they
     * do not have to perform null or empty checks. (which would cause growth and confusion in the code)
     * 
     * - Semantically, you are being asked to remove nothing.
     */
    public AppointmentRemoveStatus removeAppointment(List<Appointment> appointment)
    {
        if (appointment == null || appointment.isEmpty())
        {
            return new AppointmentRemoveStatus(Status.SUCCESS);
        }

        // ... removal code
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}