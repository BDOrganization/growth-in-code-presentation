package com.bdorganization.easilymisused.inconsistentstate.good;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class DefaultAppointment implements Appointment {
    private final long id;
    private final String description;
    private final List<Participant> participants;

    public DefaultAppointment(long id, String description,
            List<Participant> participants) {
        this.id = id;

        throwIllegalArgumentExceptionIfNull(description);
        this.description = description;
        this.participants = participants == null ? new ArrayList<Participant>(0)
                : new ArrayList<Participant>(participants);
    }

    private void throwIllegalArgumentExceptionIfNull(String description) {
        if (description == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
    }

    /**
     * @return the identifier of the appointment.
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * @return the description for the appointment. This value will never be {@code null}.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * @return all of the participants in the appointment. This list of participants could
     *         be empty but will never be {@code null}. Modifying the returned List will
     *         not change the internal state of this class.
     */
    @Override
    public List<Participant> getParticipants() {
        return new ArrayList<>(participants);
    }
}
