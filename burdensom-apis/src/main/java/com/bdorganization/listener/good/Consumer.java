package com.bdorganization.listener.good;

import com.bdorganization.listener.common.AppointmentCreatedEvent;

public class Consumer
{
    public void consume()
    {
        AppointmentManager appointmentManager = new AppointmentManager();
        appointmentManager.createAppointment(new AppointmentManagerListenerAdapter()
        {
            @Override
            public void appointmentCreated(AppointmentCreatedEvent event)
            {
                // do code when appointment is created
            }
        });
    }
}
