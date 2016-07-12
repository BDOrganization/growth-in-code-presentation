package com.bdorganization.listeneradapter.good.growth;

import com.bdorganization.listeneradapter.common.AppointmentCreateFailedEvent;
import com.bdorganization.listeneradapter.common.AppointmentCreatedEvent;

public class AppointmentManagerListenerAdapter implements AppointmentManagerListener
{
    public void appointmentCreated(AppointmentCreatedEvent event)
    {
        // Provide a no-op method such that consumers do not HAVE to override the method, but they have the option
        // if they want.
    }

    // COMPILE ERROR: In this scenario, the listener adapter will have the compile error, but given that WE
    // ARE IN CONTROL OF THIS CODE INSTEAD OF THE CONSUMER, this allows us to change the adapter when we change
    // the AppointmentManagerListener interface.
    public void appointmentCreationFailed(AppointmentCreateFailedEvent event)
    {
        // no-op
    }
}
