package com.bdorganization.listeneradapter.bad.growth;

import com.bdorganization.listeneradapter.common.AppointmentCreateFailedEvent;
import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

public interface AppointmentManagerListener
{
    void appointmentCreated(AppointmentCreatedEvent event);

    void appointmentCreationFailed(AppointmentCreateFailedEvent event);
}