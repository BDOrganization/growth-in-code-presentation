package com.bdorganization.restrictive.datastructure.bad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bdorganization.restrictive.datastructure.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc", "unused" })
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

        Set<AppointmentCriteria> appointmentCriteriaSet = new HashSet<AppointmentCriteria>();
        // DOES NOT COMPILE
        // appointmentManager.createAppointments(appointmentCriteriaSet);
    }
}
