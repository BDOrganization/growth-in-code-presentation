package com.bdorganization.listener.good;

import com.bdorganization.listener.common.AppointmentCreatedEvent;

public class AppointmentManagerListenerAdapter implements AppointmentManagerListener
{
    public void appointmentCreated(AppointmentCreatedEvent event)
    {
        // Provide a no-op method such that consumers do not HAVE to override the method, but they have the option
        // if they want.
    }
}
