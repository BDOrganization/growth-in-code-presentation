package com.bdorganization.commontasks.bad;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.commontasks.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    public static void main(String[] args)
    {
        AppointmentManager appointmentManager = new AppointmentManagerImpl();

        // Let's assume that a consumer of the appointment manager needed to create an appointment and then ensure that
        // all of the participants in the appointment were successfully booked. The consumer of this appointment manager
        // would have to do the following
        Appointment appointment = appointmentManager.createAppointment();

        List<Participant> bookedParticipants = new ArrayList<Participant>();
        for (Participant participant : appointment.getParticipants())
        {
            if (participant.isBooked())
            {
                bookedParticipants.add(participant);
            }
        }

        // Now booked participants will be contained within the list. But imagine if we have 4 consumers that need to do
        // the same thing? What if there was a more efficient way of processing collections (such as Streams?) We now
        // have to go and update every consumer. Even if the consumers realized this and created a utility, because of
        // dependency structure it might not have been realistic to share a common method amongst all consumers, making
        // them duplicate code
    }

    // Even if we were to separate out the work into a separate method, we still have to figure out how to make this
    // method available to others. When you have to decide this, you start asking questions such as where does this
    // method really belong? It is very much related to the AppointmentManager/Appointment/Participant API, but it has
    // to live somewhere with the consumer.
    public List<Participant> getConflictedParticipants(List<Participant> participants)
    {
        List<Participant> conflictedParticipants = new ArrayList<>(participants.size());
        for (Participant singleParticipant : participants)
        {
            if (singleParticipant.isConflicted())
            {
                conflictedParticipants.add(singleParticipant);
            }
        }

        return conflictedParticipants;
    }
}
