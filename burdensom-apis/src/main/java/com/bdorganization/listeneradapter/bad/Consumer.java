package com.bdorganization.listeneradapter.bad;

import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

@SuppressWarnings({ "javadoc" })
public class Consumer
{
    public void consume()
    {
        AppointmentManager appointmentManager = new AppointmentManager();
        appointmentManager.createAppointment(new AppointmentManagerListener()
        {
            @Override
            public void appointmentCreated(AppointmentCreatedEvent event)
            {
                // do code when appointment is created
            }
        });
    }
}
