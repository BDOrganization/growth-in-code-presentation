package com.bdorganization.restrictive.validation.good;

import java.util.List;

import com.bdorganization.restrictive.validation.common.Appointment;
import com.bdorganization.restrictive.validation.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    /**
     * Creates appointments based on the specified list of {@link AppointmentCriteria} objects. If {@code null} or an
     * empty list of {@link AppointmentCriteria} is specified, no actions will be taken and an empty list will be
     * returned.
     * 
     * @param criteria
     *            The list of {@link AppointmentCriteria} objects used to create the appointments. If the list is
     *            {@code null} then an empty list will be assumed. Additionally, if {@code null} elements are specified,
     *            the value will be ignored.
     * @return the list of created appointments. This list will never be {@code null} but could be empty.
     */
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
