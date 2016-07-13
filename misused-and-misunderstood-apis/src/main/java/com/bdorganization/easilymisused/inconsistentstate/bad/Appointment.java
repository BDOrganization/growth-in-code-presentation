package com.bdorganization.easilymisused.inconsistentstate.bad;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

public interface Appointment {
    long getId();

    void setId(long id);

    String getDescription();

    void setDescription(String description);

    List<Participant> getParticipants();

    void setParticipants(List<Participant> participants);
}