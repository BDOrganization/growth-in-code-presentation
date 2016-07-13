package com.bdorganization.easilymisused.inconsistentstate.bad;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc" })
public class DefaultAppointment implements Appointment {
    private long id;
    private String description;
    private List<Participant> participants;

    public DefaultAppointment(long id, String description,
            List<Participant> participants) {
        this.id = id;
        this.description = description;
        this.participants = participants;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<Participant> getParticipants() {
        return participants;
    }

    @Override
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
