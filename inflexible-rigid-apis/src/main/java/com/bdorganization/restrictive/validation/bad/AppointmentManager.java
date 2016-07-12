package com.bdorganization.restrictive.validation.bad;

import java.util.List;

import com.bdorganization.restrictive.validation.common.Appointment;
import com.bdorganization.restrictive.validation.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    /**
     * Creates appointments based on the specified list of {@link AppointmentCriteria} objects.
     * 
     * @param criteria
     *            The list of {@link AppointmentCriteria} objects used to create the appointments. This list cannot be
     *            {@code null}, empty or contain {@code null} elements.
     * @return the list of created appointments. This list will never be {@code null} but could be empty.
     * @throws IllegalArgumentException
     *             if the specified {@code criteria} is {@code null} or empty
     */
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
