package com.bdorganization.easilymisused.inconsistentstate.good.builder;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class Appointment
{
    private final long id;
    private final String description;
    private final List<Participant> participants;

    public Appointment(Builder builder)
    {
        this.id = builder.id;
        this.description = builder.description;
        this.participants = builder.participants;
    }

    /**
     * @return the identifier of the appointment.
     */
    public long getId()
    {
        return id;
    }

    /**
     * @return the description for the appointment. This value will never be {@code null}.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return all of the participants in the appointment. This list of participants could be empty but will never be
     *         {@code null}.
     */
    public List<Participant> getParticipants()
    {
        return participants;
    }

    public static class Builder
    {
        private long id;
        private String description;
        private List<Participant> participants;

        public Builder id(long id)
        {
            this.id = id;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Builder participants(List<Participant> participants)
        {
            this.participants = participants;
            return this;
        }

        // Enforce all desired state inside of the build method.
        public Appointment build()
        {
            throwIllegalStateIfNull(this.description);
            this.participants = emptyListIfNull(this.participants);
            this.participants = new ArrayList<>(this.participants);
            return new Appointment(this);
        }

        private static void throwIllegalStateIfNull(String description)
        {
            if (description == null)
            {
                throw new IllegalStateException("description cannot be null");
            }
        }

        private static List<Participant> emptyListIfNull(List<Participant> participants)
        {
            if (participants == null)
            {
                return new ArrayList<Participant>(0);
            }

            return participants;
        }
    }
}
