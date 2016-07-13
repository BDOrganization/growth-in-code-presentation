package com.bdorganization.restrictive.datastructure.good;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bdorganization.restrictive.datastructure.common.AppointmentCriteria;

/**
 * With the createAppointment methods now taking in a collection, we can specify any extension/implementation of the
 * Collections interface. This gives all consumers the ultimate flexibility to ensure that they do not have to transform
 * their set into a List, etc.
 */
@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consume()
    {
        List<AppointmentCriteria> appointmentCriteria = new ArrayList<AppointmentCriteria>();
        appointmentManager.createAppointments(appointmentCriteria);

        // DOES COMPILE!
        Set<AppointmentCriteria> appointmentCriteriaSet = new HashSet<AppointmentCriteria>();
        appointmentManager.createAppointments(appointmentCriteriaSet);
    }
}
