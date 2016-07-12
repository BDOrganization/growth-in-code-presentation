package com.bdorganization.easilymisused.strongtype.good;

@SuppressWarnings({ "javadoc" })
public class Participant
{
    private final ParticipantIdentifier id;

    public Participant(ParticipantIdentifier id)
    {
        this.id = id;
    }

    public ParticipantIdentifier getId()
    {
        return id;
    }
}
