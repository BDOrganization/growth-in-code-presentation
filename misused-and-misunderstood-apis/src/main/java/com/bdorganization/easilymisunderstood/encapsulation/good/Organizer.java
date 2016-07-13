package com.bdorganization.easilymisunderstood.encapsulation.good;

@SuppressWarnings("javadoc")
public class Organizer
{
    private final long organizerId;
    private final String organizerName;

    public Organizer(long organizerId, String organizerName)
    {
        this.organizerId = organizerId;
        this.organizerName = organizerName;
    }

    public long getOrganizerId()
    {
        return organizerId;
    }

    public String getOrganizerName()
    {
        return organizerName;
    }
}
