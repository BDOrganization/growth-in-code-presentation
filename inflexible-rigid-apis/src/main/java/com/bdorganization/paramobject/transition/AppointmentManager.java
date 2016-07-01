package com.bdorganization.paramobject.transition;

import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

@SuppressWarnings("javadoc")
public interface AppointmentManager
{
    /**
     * ... other javadoc
     * 
     * @deprecated call {@link AppointmentManager#getAppointments(AppointmentRetrievalCriteria)} instead.
     */
    @Deprecated
    List<Appointment> getAppointments(long appointmentId);

    // this is an easy migration, given that you should be able to support the same functionality, the consumer would
    // just have to specify an appointment retrieval criteria with only an appointment id.
    List<Appointment> getAppointments(AppointmentRetrievalCriteria criteria);
}
