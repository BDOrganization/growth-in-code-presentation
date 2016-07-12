package com.bdorganization.easilymisused.inconsistentstate.bad;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc" })
public class Appointment
{
    private long id;
    private String description;
    private List<Participant> participants;

    public Appointment(long id, String description, List<Participant> participants)
    {
        this.id = id;
        this.description = description;
        this.participants = participants;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Participant> getParticipants()
    {
        return participants;
    }

    public void setParticipants(List<Participant> participants)
    {
        this.participants = participants;
    }
}
