package com.bdorganization.commontasks.good;

import java.util.List;

import com.bdorganization.commontasks.common.Participant;

// Suppress unused warnings since this is showing what the API is capable of, not necessarily consuming it.
@SuppressWarnings({ "javadoc", "unused" })
public class Consumer
{
    public static void main(String[] args)
    {
        AppointmentManager appointmentManager = new AppointmentManagerImpl();
        Appointment appointment = appointmentManager.createAppointment();

        Participants participants = appointment.getParticipants();

        /*
         * In this scenario, all of the heavy lifting is taken care of FOR the consumer. On top of that, if any
         * additional consumers want to do the same kind of work, they can simply call these methods and there is no
         * concern of duplicate code.
         * 
         * This change allows the producer (the AppointmentManager/Appointment/Participants/Participant API) to make
         * enhancements internally without affecting consumers in the future. For example, if the producer wanted to
         * move to java 8 streams in the future and process the participants in parallel, etc., it can be done without
         * ever breaking the consumer, AND it would be an efficiency given to ALL consumers instead of just the ones
         * that were updated.
         * 
         * This presentation assumes java 7, but if you were able to be on java 8, an alternative could be to simply
         * return a stream of Participant objects instead.
         */

        List<Participant> bookedParticipants = participants.getAllBookedParticipants();
        List<Participant> conflictedParticipants = participants.getAllConflictedParticipants();
        List<Participant> allParticipants = participants.getAllParticipants();
    }
}