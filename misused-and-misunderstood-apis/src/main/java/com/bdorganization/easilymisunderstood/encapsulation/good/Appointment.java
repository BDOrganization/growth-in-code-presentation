package com.bdorganization.easilymisunderstood.encapsulation.good;

/**
 * There is a significant difference now between the old appointment object and the newer one that correctly
 * encapsulates separate concepts. This allows for anyone reading this class to quickly identify all that an appointment
 * is composed of without having to know the specifics.
 * 
 * Enumerated benefits:
 * <ul>
 * <li>Fields and functionality can expand without polluting (or even modifying) the appointment object. For example, if
 * we want to add additional approaches for how the appointment can be scheduled, it will not appear in this class. It
 * has been abstracted away.</li>
 * <li>These concepts can be re-used in other classes.</li>
 * <li>Testing is greatly simplified. I no longer have to have 11 fields (as the bad example has) but instead the tests
 * are very focused to the 5 fields here.</li>
 * </ul>
 * 
 * Additional Warning: Do not wait to encapsulate data. By that time, the class might already have too many consumption
 * points to address encapsulation needs (and re-factoring) needed for the given timeline that you have. It might seem
 * like it would be simple enough to address as soon as the class starts to grow, but this will likely not be true. You
 * cannot guarantee that you will even be the person doing the work for it. Set others up for success when they modify
 * your code, not failure. The case study indicated that there were very few modifications to the class and releases in
 * the project until many <strong>years</strong> after the code was originally written.
 * 
 * RELATED: See the stats-procressed-scrubbed.xlsx file in the src/main/resources folder for a case study of a file that
 * grew over time.
 */
@SuppressWarnings("javadoc")
public class Appointment
{
    private long appointmentId;
    private String description;
    private Organizer organizer;
    private Room room;
    private Schedule schedule;

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

    public Organizer getOrganizer()
    {
        return organizer;
    }

    public void setOrganizer(Organizer organizer)
    {
        this.organizer = organizer;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Schedule getSchedule()
    {
        return schedule;
    }

    public void setSchedule(Schedule schedule)
    {
        this.schedule = schedule;
    }
}