package com.bdorganization.paramobject.good;

import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    List<Appointment> getAppointments(AppointmentRetrievalCriteria criteria);
}
