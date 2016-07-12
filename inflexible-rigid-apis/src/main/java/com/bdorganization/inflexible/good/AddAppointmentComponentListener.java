package com.bdorganization.inflexible.good;

import com.bdorganization.inflexible.common.ScheduledAppointment;

public interface AddAppointmentComponentListener
{
    // Notifies that the appointment was scheduled; leaves consumers the capability to parent the component in whatever
    // way works for their workflow
    public void appointmentScheduled(ScheduledAppointment appointment);
}
