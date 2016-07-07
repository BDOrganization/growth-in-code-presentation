package com.bdorganization.easilymisunderstood.typeabuse.transition.wrapper;

@SuppressWarnings("javadoc")
public class RecurringAppointment
{
    private final long appointmentId;
    private final String recurrence;

    public RecurringAppointment(long appointmentId, String recurrence)
    {
        this.appointmentId = appointmentId;
        this.recurrence = recurrence;
    }

    /**
     * @return the identifier of the appointment.
     */
    public long getAppointmentId()
    {
        return appointmentId;
    }

    /**
     * @return string representing the days of the week. For the day of the week that the recurrence is on, an 'X'
     *         character will be present. For days of the week that there is no recurrence, a space character will be
     *         present.
     */
    public String getWeeklyRecurrence()
    {
        return recurrence;
    }
}
