package com.bdorganization.commontasks.good;

import java.util.ArrayList;
import java.util.List;

import com.bdorganization.commontasks.common.MockParticipantData;
import com.bdorganization.commontasks.common.Participant;

@SuppressWarnings({ "javadoc" })
public class AppointmentManagerImpl implements AppointmentManager
{
    @Override
    public Appointment createAppointment()
    {
        return new AppointmentImpl(new ParticipantsImpl(MockParticipantData.createMockParticipants()));
    }

    private static class AppointmentImpl implements Appointment
    {
        private final Participants participants;

        public AppointmentImpl(Participants participants)
        {
            this.participants = participants;
        }

        /**
         * @return the participants
         */
        @Override
        public Participants getParticipants()
        {
            return participants;
        }
    }

    private static class ParticipantsImpl implements Participants
    {
        private final List<Participant> participants;

        public ParticipantsImpl(List<Participant> participants)
        {
            this.participants = participants;
        }

        @Override
        public List<Participant> getAllParticipants()
        {
            return new ArrayList<>(participants);
        }

        @Override
        public List<Participant> getAllBookedParticipants()
        {
            List<Participant> bookedParticipants = new ArrayList<>();
            for (Participant singleParticipant : participants)
            {
                if (singleParticipant.isBooked())
                {
                    bookedParticipants.add(singleParticipant);
                }
            }
            return bookedParticipants;
        }

        @Override
        public List<Participant> getAllConflictedParticipants()
        {
            List<Participant> conflictedParticipants = new ArrayList<>();
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
}
