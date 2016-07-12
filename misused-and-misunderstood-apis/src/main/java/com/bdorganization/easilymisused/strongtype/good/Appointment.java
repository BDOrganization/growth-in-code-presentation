package com.bdorganization.easilymisused.strongtype.good;

import java.util.List;

@SuppressWarnings({ "javadoc" })
public class Appointment
{
    private final AppointmentIdentifier id;
    private final List<Participant> participants;

    public Appointment(AppointmentIdentifier id, List<Participant> participants)
    {
        this.id = id;
        this.participants = participants;
    }

    public AppointmentIdentifier getId()
    {
        return id;
    }

    public List<Participant> getParticipants()
    {
        return participants;
    }
}