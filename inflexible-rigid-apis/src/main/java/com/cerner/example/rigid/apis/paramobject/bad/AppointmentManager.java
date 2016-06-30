package com.cerner.example.rigid.apis.paramobject.bad;

import java.util.List;

import com.cerner.example.rigid.apis.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    List<Appointment> getAppointments(long appointmentId);
}
