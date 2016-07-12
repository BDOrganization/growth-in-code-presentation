package com.bdorganization.listeneradapter.bad;

import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
}