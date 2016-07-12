package com.bdorganization.easilymisused.strongtype.bad;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    private final ParticipantScheduleManager participantScheduleManager;

    public Consumer(ParticipantScheduleManager participantScheduleManager)
    {
        this.participantScheduleManager = participantScheduleManager;
    }

    /**
     * As you can see from the consuming code below, having primitive identifiers allows for the consumer to pass in the
     * wrong value accidentally to the API. This is a problem because the participant class and the appointment class
     * both have a "getId" that returns a primitive value, and the {@link ParticipantScheduleManager} class also accepts
     * a primitive value.
     */
    public void consume(Appointment appointment)
    {
        for (Participant participant : appointment.getParticipants())
        {
            System.out.println("Getting schedule for participant: " + participant.getId());
            // oops! You can see here that the wrong ID was used
            System.out.println(participantScheduleManager.getParticipantSchedule(appointment.getId()));
        }
    }
}
