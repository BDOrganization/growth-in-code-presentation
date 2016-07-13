package com.bdorganization.paramobject.good;

import java.util.List;

import com.bdorganization.paramobject.common.Appointment;

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
        /*
         * While the builder pattern is not required to construct the ApppointmentRetrievalCriteria, it does pair very
         * well with the parameter object pattern.
         * 
         * With this approach the whole object is passed in. Given that there is only one field this does require
         * additional effort, but this approach really shines when you consider growth in the criteria that is passed
         * in.
         */
        AppointmentRetrievalCriteria.Builder builder = new AppointmentRetrievalCriteria.Builder();
        builder.appointmentId(1L);
        List<Appointment> appointment = appointmentManager.getAppointments(builder.build());
    }
}