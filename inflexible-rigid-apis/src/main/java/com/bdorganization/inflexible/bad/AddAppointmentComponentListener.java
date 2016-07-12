package com.bdorganization.inflexible.bad;

import com.bdorganization.inflexible.common.ScheduledAppointment;

public interface AddAppointmentComponentListener
{
    // Notifies that the component was closed; awkward/confusing API if component were embedded rather than modal
    public void addAppointmentComponentClosed(ScheduledAppointment appointment);
}
