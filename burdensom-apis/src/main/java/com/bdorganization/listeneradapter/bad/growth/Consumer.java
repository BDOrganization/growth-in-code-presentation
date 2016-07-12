package com.bdorganization.listeneradapter.bad.growth;

import com.bdorganization.listeneradapter.common.AppointmentCreateFailedEvent;
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

            // THIS BREAKS CONSUMERS. This new method causes a compilation failure because we now have to add an
            // implementation to this interface
            @Override
            public void appointmentCreationFailed(AppointmentCreateFailedEvent event)
            {
                // consumer must now implement this new method even though they might not need it.
            }
        });
    }
}
