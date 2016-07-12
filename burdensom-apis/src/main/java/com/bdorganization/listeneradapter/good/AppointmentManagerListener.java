package com.bdorganization.listeneradapter.good;

import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
}