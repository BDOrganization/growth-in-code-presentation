package com.bdorganization.easilymisused.inconsistentstate.good.builder;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class DefaultAppointment implements Appointment {
    private final long id;
    private final String description;
    private final List<Participant> participants;

    public DefaultAppointment(DefaultBuilder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.participants = builder.participants;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<Participant> getParticipants() {
        return participants;
    }

    public static class DefaultBuilder implements Builder {
        private long id;
        private String description;
        private List<Participant> participants;

        @Override
        public Builder id(long id) {
            this.id = id;
            return this;
        }

        @Override
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public Builder participants(List<Participant> participants) {
            this.participants = participants;
            return this;
        }

        // Enforce all desired state inside of the build method.
        @Override
        public Appointment build() {
            throwIllegalStateIfNull(this.description);
            this.participants = emptyListIfNull(this.participants);
            this.participants = new ArrayList<>(this.participants);
            return new DefaultAppointment(this);
        }

        private static void throwIllegalStateIfNull(String description) {
            if (description == null) {
                throw new IllegalStateException("description cannot be null");
            }
        }

        private static List<Participant> emptyListIfNull(List<Participant> participants) {
            if (participants == null) {
                return new ArrayList<Participant>(0);
            }

            return participants;
        }
    }
}
