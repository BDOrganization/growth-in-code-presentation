package com.bdorganization.listener.bad.growth;

import com.bdorganization.listener.common.AppointmentCreateFailedEvent;
import com.bdorganization.listener.common.AppointmentCreatedEvent;

public class Consumer
{
    public void consume()
    {
        AppointmentManager appointmentManager = new AppointmentManager();
        appointmentManager.createAppointment(new AppointmentManagerListener()
        {
            public void appointmentCreated(AppointmentCreatedEvent event)
            {
                // do code when appointment is created
            }

            // THIS BREAKS CONSUMERS. This new method causes a compilation failure because we now have to add an
            // implementation to this interface
            public void appointmentCreationFailed(AppointmentCreateFailedEvent event)
            {
                // consumer must now implement this new method even though they might not need it.
            }
        });
    }
}
