package com.bdorganization.listeneradapter.bad;

import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);
}