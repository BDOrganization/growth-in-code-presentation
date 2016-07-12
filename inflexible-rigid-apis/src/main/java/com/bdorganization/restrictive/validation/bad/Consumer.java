package com.bdorganization.restrictive.validation.bad;

import java.util.Collections;
import java.util.List;

import com.bdorganization.restrictive.validation.common.Appointment;
import com.bdorganization.restrictive.validation.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    /**
     * Consider the only lines that are even valuable in the following method... retrieving the appointments and
     * printing them out. The rejection of empty list, null list, or list that contains a null appointment criteria just
     * adds additional burden that the consumer has to deal with and distracts from what the consumer is trying to do.
     * 
     * The argument could be made that the criteria for creating the appointment is coming from the method call and most
     * of the time you are constructing the criteria yourself. While this is a true statement, it still does not matter.
     * Generally, you are constructing the criteria from a separate list of objects. You still have to ensure that the
     * source list that the appointment criteria list is constructed from is not empty, etc.
     * 
     * When you consider the amount of extra effort put in just to consume the appointment manager, imagine that there
     * were many more consumers of this as well. They would all have to do the same thing.
     */
    public void consume(List<AppointmentCriteria> appointmentCriteria)
    {
        List<Appointment> appointments = null;
        if (appointmentCriteria != null && !appointmentCriteria.isEmpty())
        {
            // removes all null elements
            appointmentCriteria.removeAll(Collections.singleton(null));
            appointments = appointmentManager.createAppointments(appointmentCriteria);
        }

        System.out.println(appointments);
    }
}