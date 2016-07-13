package com.bdorganization.paramobject.bad.growth;

import java.util.Date;
import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    List<Appointment> getAppointments(long appointmentId, long participantId, Date beginDate, Date endDate);
}
