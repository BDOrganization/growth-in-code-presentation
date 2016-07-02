package com.bdorganization.listener.bad;

import com.bdorganization.listener.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
}