package com.bdorganization.paramobject.good.growth;

import java.util.Date;

@SuppressWarnings("javadoc")
public class AppointmentRetrievalCriteria
{
    private final long appointmentId;
    private final long participantId;
    private final Date beginDate;
    private final Date endDate;

    public AppointmentRetrievalCriteria(Builder builder)
    {
        this.appointmentId = builder.appointmentId;
        this.participantId = builder.participantId;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
    }

    public long getAppointmentId()
    {
        return appointmentId;
    }

    public long getParticipantId()
    {
        return participantId;
    }

    public Date getBeginDate()
    {
        return beginDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public static class Builder
    {
        private long appointmentId;
        private long participantId;
        private Date beginDate;
        private Date endDate;

        public Builder appointmentId(long appointmentId)
        {
            this.appointmentId = appointmentId;
            return this;
        }

        public Builder participantId(long participantId)
        {
            this.participantId = participantId;
            return this;
        }

        public Builder beginDate(Date beginDate)
        {
            this.beginDate = beginDate;
            return this;
        }

        public Builder endDate(Date endDate)
        {
            this.endDate = endDate;
            return this;
        }

        public AppointmentRetrievalCriteria build()
        {
            return new AppointmentRetrievalCriteria(this);
        }
    }
}
