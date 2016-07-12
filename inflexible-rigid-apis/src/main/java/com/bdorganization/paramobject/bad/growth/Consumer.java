package com.bdorganization.paramobject.bad.growth;

import java.util.Date;
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
         * CONSUMER NO LONGER COMPILES!
         * 
         * By adding additional parameters, we have made it such that the consumer would have to be updated to use the
         * new fields.
         */
        // List<Appointment> appointment = appointmentManager.getAppointments(1L);

        /*
         * In situations where only the id of the appointment is required, this means that we now have to pass in null
         * ids, and 0 values (which we hope appointment manager ignores) or we have to figure out a way to retrieve the
         * information.
         * 
         * Anyone reading this code will have to do some digging to figure out what it is that is getting specified a
         * null value to as well. It is just not readable.
         */
        List<Appointment> appointment = appointmentManager.getAppointments(1L, 0L, null, null);

        /*
         * The other problem with taking in so many fields is that there is no clear way to differentiate between the
         * argument ordering. Consider the following method calls:
         */
        long appointmentId = 1L;
        long participantId = 2L;
        Date beginDate = new Date(100L);
        Date endDate = new Date(200L);

        // Can you GUESS which one is right?
        appointmentManager.getAppointments(participantId, appointmentId, endDate, beginDate);
        appointmentManager.getAppointments(participantId, appointmentId, beginDate, endDate);
        appointmentManager.getAppointments(appointmentId, participantId, beginDate, endDate);

        // What if only SOME of the fields are required...
        appointmentManager.getAppointments(participantId, appointmentId, endDate, null);
        appointmentManager.getAppointments(participantId, appointmentId, null, endDate);
        appointmentManager.getAppointments(participantId, 0L, endDate, null);
    }
}
