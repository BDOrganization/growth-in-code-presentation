package com.bdorganization.paramobject.bad;

import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    List<Appointment> getAppointments(long appointmentId);
}
