package com.bdorganization.easilymisused.strongtype.good;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    private final ParticipantScheduleManager participantScheduleManager;

    public Consumer(ParticipantScheduleManager participantScheduleManager)
    {
        this.participantScheduleManager = participantScheduleManager;
    }

    /**
     * With a simple change of creating a strongly typed identifier for the appointment and another strongly typed
     * identifier for the participant. Then we make the participant schedule manager require that the participant
     * identifier be provided.
     */
    public void consume(Appointment appointment)
    {
        for (Participant participant : appointment.getParticipants())
        {
            System.out.println("Getting schedule for participant: " + participant.getId());

            /*
             * The line below that was previously working no longer compiles! This allows the consumers to know right
             * away when they have tried to code a defect.
             */
            // System.out.println(participantScheduleManager.getParticipantSchedule(appointment.getId()));

            System.out.println(participantScheduleManager.getParticipantSchedule(participant.getId()));
        }
    }

    /**
     * An alternative that can serve the same purpose is the provide the entire {@link Participant} object to the
     * {@link ParticipantScheduleManager}. Like the strongly typed identifier, this ensures that the wrong object is not
     * provided. For most situations, this will probably work, but the consumer should be considered. Requiring the
     * entire participant object might be requiring quite a few fields to be specified, whereas the participant
     * identifier might really be the only true requirement.
     * 
     * Basically, by only requiring the {@link ParticipantIdentifier}, the requirement to consume the
     * {@link ParticipantScheduleManager} is lessened.
     */
    public void consumeAlternative(Appointment appointment)
    {
        for (Participant participant : appointment.getParticipants())
        {
            System.out.println("Getting schedule for participant: " + participant.getId());
            System.out.println(participantScheduleManager.getParticipantSchedule(participant));
        }
    }
}
