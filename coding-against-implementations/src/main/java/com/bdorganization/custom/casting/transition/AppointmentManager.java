package com.bdorganization.custom.casting.transition;

import com.bdorganization.custom.casting.transition.AppointmentRemoveStatus.Status;

public class AppointmentManager
{
    public AppointmentRemoveStatus removeAppointment(Appointment appointment)
    {
        DefaultAppointment defaultAppointment = (DefaultAppointment) appointment;
        System.out.println("Description: " + defaultAppointment.getDescription());
        System.out.println("Id: " + defaultAppointment.getId());
        System.out.println("Organizer: " + defaultAppointment.getOrganizerName());
        
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}
