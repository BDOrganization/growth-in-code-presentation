package com.bdorganization.restrictive.validation.good;

import java.util.List;

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
     * With the approach of just accepting the null or empty list, and ignoring all null elements, we greatly reduce the
     * burden on the consumer. Even more so, we reduce the burden for ALL consumers.
     */
    public void consume(List<AppointmentCriteria> appointmentCriteria)
    {
        System.out.println(appointmentManager.createAppointments(appointmentCriteria));
    }
}