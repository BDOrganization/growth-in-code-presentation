package com.bdorganization.custom.bad;

public class DefaultAppointment implements Appointment
{
    private final long id;
    private final String description;

    public DefaultAppointment(long id, String description)
    {
        this.id = id;
        this.description = description;
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
}
