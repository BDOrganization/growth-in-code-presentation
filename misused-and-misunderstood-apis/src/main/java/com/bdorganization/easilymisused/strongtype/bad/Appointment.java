package com.bdorganization.easilymisused.strongtype.bad;

import java.util.List;

@SuppressWarnings({ "javadoc" })
public class Appointment
{
    private final long id;
    private final List<Participant> participants;

    public Appointment(long id, List<Participant> participants)
    {
        this.id = id;
        this.participants = participants;
    }

    public long getId()
    {
        return id;
    }

    public List<Participant> getParticipants()
    {
        return participants;
    }
}