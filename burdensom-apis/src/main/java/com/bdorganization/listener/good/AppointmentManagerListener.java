package com.bdorganization.listener.good;

import com.bdorganization.listener.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
}