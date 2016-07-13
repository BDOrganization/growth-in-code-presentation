package com.bdorganization.easilymisused.inconsistentstate.good;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class Appointment
{
    private final long id;
    private final String description;
    private final List<Participant> participants;

    public Appointment(long id, String description, List<Participant> participants)
    {
        this.id = id;

        if (description == null)
        {
            throw new IllegalArgumentException("description cannot be null");
        }
        this.description = description;

        if (participants == null)
        {
            this.participants = new ArrayList<>();
        }
        else
        {
            this.participants = new ArrayList<>(participants);
        }
    }

    /**
     * @return the identifier of the appointment.
     */
    public long getId()
    {
        return id;
    }

    /**
     * @return the description for the appointment. This value will never be {@code null}.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return all of the participants in the appointment. This list of participants could be empty but will never be
     *         {@code null}. Modifying the returned List will not change the internal state of this class.
     */
    public List<Participant> getParticipants()
    {
        return new ArrayList<>(participants);
    }
}
