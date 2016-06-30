package com.cerner.example.rigid.apis.paramobject.good;

import java.util.List;

import com.cerner.example.rigid.apis.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    List<Appointment> getAppointments(AppointmentRetrievalCriteria criteria);
}
