package com.bdorganization.listeneradapter.good.growth;

@SuppressWarnings({ "javadoc", "nls" })
public class AppointmentManager
{
    public void createAppointment(AppointmentManagerListener listener)
    {
        // this would call the appointment created method with information about the created
        // appointment on the event.
        listener.appointmentCreated(null);
    }
}
