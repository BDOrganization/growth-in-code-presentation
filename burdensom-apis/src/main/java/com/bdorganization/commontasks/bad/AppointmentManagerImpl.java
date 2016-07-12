package com.bdorganization.commontasks.bad;

import java.util.List;

import com.bdorganization.commontasks.common.MockParticipantData;
import com.bdorganization.commontasks.common.Participant;

@SuppressWarnings({ "javadoc" })
public class AppointmentManagerImpl implements AppointmentManager
{
    @Override
    public Appointment createAppointment()
    {
        // this is all mock code, in reality we would call a service or something else to create the appointments.
        return new AppointmentImpl(MockParticipantData.createMockParticipants());
    }

    private class AppointmentImpl implements Appointment
    {
        private final List<Participant> participants;

        public AppointmentImpl(List<Participant> participants)
        {
            this.participants = participants;
        }

        @Override
        public List<Participant> getParticipants()
        {
            return participants;
        }
    }
}
