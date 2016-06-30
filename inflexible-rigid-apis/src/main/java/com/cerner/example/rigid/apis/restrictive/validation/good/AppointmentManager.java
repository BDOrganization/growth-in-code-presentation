package com.cerner.example.rigid.apis.restrictive.validation.good;

import java.util.List;

import com.cerner.example.rigid.apis.restrictive.validation.common.Appointment;
import com.cerner.example.rigid.apis.restrictive.validation.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    /**
     * Creates appointments based on the specified list of {@link AppointmentCriteria} objects. If an empty list of
     * {@link AppointmentCriteria} is specified, no actions will be taken and an empty list will be returned.
     * 
     * @param criteria
     *            The list of {@link AppointmentCriteria} objects used to create the appointments. If the list is
     *            {@code null} then an empty list will be assumed. Additionally, if {@code null} elements are specified,
     *            the value will be ignored.
     * @return the list of created appointments.
     */
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
