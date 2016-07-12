package com.bdorganization.easilymisused.inconsistentstate.good;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    /**
     * In this situation, the Appointment cannot be changed after it is constructed. That, paired with the fact that the
     * description is validated in the constructor of the appointment means that the provided appointment can be trusted
     * to not have a {@code null} description.
     * 
     * This allows our consuming code to be greatly simplified.
     */
    public void consume(Appointment appointment)
    {
        System.out.println("Appointment Description Length: " + appointment.getDescription().length());
    }

    /**
     * In this example, given that we are ensuring a consistent state, we have the benefit of being able to iterate over
     * the participants on the appointment without having to remember to null check (given that the participants are
     * either empty or contain items, but never null).
     * 
     * This is enforced through the constructor as well. For loops are a very easy situation to accidentally introduce a
     * potential null pointer exception simply because the code does not show a direct call against the list to get the
     * iterator ({@link List#iterator()}), however, it is implied.
     */
    public void consumeParticipants(Appointment appointment)
    {
        for (Participant participant : appointment.getParticipants())
        {
            System.out.println("Participant: " + participant.getName());
        }
    }
}
