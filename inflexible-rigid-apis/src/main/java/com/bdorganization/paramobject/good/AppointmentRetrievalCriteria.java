package com.bdorganization.paramobject.good;

@SuppressWarnings("javadoc")
public class AppointmentRetrievalCriteria
{
    private final long appointmentId;

    public AppointmentRetrievalCriteria(Builder builder)
    {
        this.appointmentId = builder.appointmentId;
    }

    public long getAppointmentId()
    {
        return appointmentId;
    }

    public static class Builder
    {
        private long appointmentId;

        public Builder appointmentId(long appointmentId)
        {
            this.appointmentId = appointmentId;
            return this;
        }

        public AppointmentRetrievalCriteria build()
        {
            return new AppointmentRetrievalCriteria(this);
        }
    }
}
