package com.cerner.example.rigid.apis.restrictive.bad;

import java.util.List;

import com.cerner.example.rigid.apis.restrictive.common.Appointment;
import com.cerner.example.rigid.apis.restrictive.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    /**
     * Creates appointments based on the specified list of {@link AppointmentCriteria} objects.
     * 
     * @param criteria
     *            The list of {@link AppointmentCriteria} objects used to create the appointments. This list cannot be
     *            {@code null}, empty or contain {@code null} elements.
     * @return the list of created appointments.
     */
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
