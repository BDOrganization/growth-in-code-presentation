package com.bdorganization.custom.casting.transition.alternative;

import com.bdorganization.custom.casting.transition.alternative.AppointmentRemoveStatus.Status;

public class AppointmentManager
{
    public AppointmentRemoveStatus removeAppointment(RemovableAppointment appointment)
    {
        System.out.println("Description: " + appointment.getDescription());
        System.out.println("Id: " + appointment.getId());
        System.out.println("Organizer: " + appointment.getOrganizerName());
        
        return new AppointmentRemoveStatus(Status.SUCCESS);
    }
}
