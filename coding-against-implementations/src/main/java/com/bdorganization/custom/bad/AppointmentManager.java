package com.bdorganization.custom.bad;

import com.bdorganization.custom.bad.AppointmentRemoveStatus.Status;

public class AppointmentManager
{
    /*
     * DON'T DO THIS! This limits your API such that you can only ever specify the DefaultAppointment implementation of
     * this class.
     */
    public AppointmentRemoveStatus removeAppointment(DefaultAppointment appointment)
    {

        System.out.println("Removing " + appointment.getDescription() + " with id " + appointment.getId());
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}
