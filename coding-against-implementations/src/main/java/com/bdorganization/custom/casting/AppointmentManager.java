package com.bdorganization.custom.casting;

import com.bdorganization.custom.casting.AppointmentRemoveStatus.Status;

public class AppointmentManager
{
    /*
     * Here we take in the Appointment object to make people think it is coded against an interface...
     */
    public AppointmentRemoveStatus removeAppointment(Appointment appointment)
    {
        DefaultAppointment defaultAppointment = (DefaultAppointment) appointment;
        System.out.println("Description: " + defaultAppointment.getDescription());
        System.out.println("Id: " + defaultAppointment.getId());
        System.out.println("Organizer: " + defaultAppointment.getOrganizerName());
        
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}
