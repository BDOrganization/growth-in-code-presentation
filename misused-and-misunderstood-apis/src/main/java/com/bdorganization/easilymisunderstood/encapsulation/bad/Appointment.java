package com.bdorganization.easilymisunderstood.encapsulation.bad;

import java.util.Date;
import java.util.Set;

import com.bdorganization.easilymisunderstood.encapsulation.common.DayOfWeek;
import com.bdorganization.easilymisunderstood.encapsulation.common.MonthOfYear;

@SuppressWarnings("javadoc")
public class Appointment
{
    private long appointmentId;
    private String description;
    private long organizerId;
    private String organizerName;
    private long roomId;
    private String roomDescription;
    private boolean doesRoomHaveProjector;
    private Date beginTime;
    private Date endTime;
    private Set<DayOfWeek> weeklyRecurrence;
    private Set<MonthOfYear> monthlyRecurrence;

    public long getAppointmentId()
    {
        return appointmentId;
    }

    public void setAppointmentId(long appointmentId)
    {
        this.appointmentId = appointmentId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getOrganizerId()
    {
        return organizerId;
    }

    public void setOrganizerId(long organizerId)
    {
        this.organizerId = organizerId;
    }

    public String getOrganizerName()
    {
        return organizerName;
    }

    public void setOrganizerName(String organizerName)
    {
        this.organizerName = organizerName;
    }

    public long getRoomId()
    {
        return roomId;
    }

    public void setRoomId(long roomId)
    {
        this.roomId = roomId;
    }

    public String getRoomDescription()
    {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription)
    {
        this.roomDescription = roomDescription;
    }

    public boolean isDoesRoomHaveProjector()
    {
        return doesRoomHaveProjector;
    }

    public void setDoesRoomHaveProjector(boolean doesRoomHaveProjector)
    {
        this.doesRoomHaveProjector = doesRoomHaveProjector;
    }

    public Date getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(Date beginTime)
    {
        this.beginTime = beginTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

    public Set<DayOfWeek> getWeeklyRecurrence()
    {
        return weeklyRecurrence;
    }

    public void setWeeklyRecurrence(Set<DayOfWeek> weeklyRecurrence)
    {
        this.weeklyRecurrence = weeklyRecurrence;
    }

    public Set<MonthOfYear> getMonthlyRecurrence()
    {
        return monthlyRecurrence;
    }

    public void setMonthlyRecurrence(Set<MonthOfYear> monthlyRecurrence)
    {
        this.monthlyRecurrence = monthlyRecurrence;
    }
}