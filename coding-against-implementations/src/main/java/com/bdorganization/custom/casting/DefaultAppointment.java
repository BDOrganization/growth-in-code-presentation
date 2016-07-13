package com.bdorganization.custom.casting;

public class DefaultAppointment implements Appointment
{
    private final long id;
    private final String description;
    private final String organizerName;

    public DefaultAppointment(long id, String description, String organizerName)
    {
        this.id = id;
        this.description = description;
        this.organizerName = organizerName;
    }

    @Override
    public long getId()
    {
        return id;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    public String getOrganizerName()
    {
        return organizerName;
    }
}
