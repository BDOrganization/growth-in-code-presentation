package com.bdorganization.easilymisused.inconsistentstate.good.builder;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

public interface Appointment {

    /**
     * @return the identifier of the appointment.
     */
    long getId();

    /**
     * @return the description for the appointment. This value will never be {@code null}.
     */
    String getDescription();

    /**
     * @return all of the participants in the appointment. This list of participants could be empty but will never be
     *         {@code null}.
     */
    List<Participant> getParticipants();

}