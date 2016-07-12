package com.bdorganization.easilymisused.inconsistentstate.common;

@SuppressWarnings({ "javadoc" })
public class Participant
{
    private final String name;

    public Participant(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}