package com.bdorganization.paramobject.bad;

import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

@SuppressWarnings({ "javadoc", "unused" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consume()
    {
        List<Appointment> appointment = appointmentManager.getAppointments(1L);
    }
}
