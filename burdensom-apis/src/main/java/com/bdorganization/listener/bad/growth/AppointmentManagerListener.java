package com.bdorganization.listener.bad.growth;

import com.bdorganization.listener.common.AppointmentCreateFailedEvent;
import com.bdorganization.listener.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
    
    void appointmentCreationFailed(AppointmentCreateFailedEvent event);
}