package com.bdorganization.listener.good.growth;

import com.bdorganization.listener.common.AppointmentCreatedEvent;

public class Consumer
{
    public void consume()
    {
        AppointmentManager appointmentManager = new AppointmentManager();
        appointmentManager.createAppointment(new AppointmentManagerListenerAdapter()
        {
            // CONSUMER STILL COMPILES AND WORKS: this allows the consumer to not have to implement the newly created
            // appointmentCreationFailed method because the AppointmentManagerListenerAdapter already implements it.
            // When the AppointmentManager calls the appointmentCreationFailed method, nothing is done in response.
            // Consumers can now migrate to the new method at any time that they like, or if they choose not to handle
            // certain methods, they do not have to worry about it.

            // The only downfall to this is that consumers are now less likely to migrate to preferred approaches.
            @Override
            public void appointmentCreated(AppointmentCreatedEvent event)
            {
                // do code when appointment is created
            }
        });
    }
}