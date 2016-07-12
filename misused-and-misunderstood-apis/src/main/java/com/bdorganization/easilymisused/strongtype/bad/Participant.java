package com.bdorganization.easilymisused.strongtype.bad;

@SuppressWarnings({ "javadoc" })
public class Participant
{
    private final long id;

    public Participant(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
}
