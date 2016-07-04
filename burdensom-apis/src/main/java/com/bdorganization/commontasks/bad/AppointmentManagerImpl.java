package com.bdorganization.commontasks.bad;

import java.util.List;

import com.bdorganization.commontasks.common.MockParticipantData;
import com.bdorganization.commontasks.common.Participant;

public class AppointmentManagerImpl implements AppointmentManager
{
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

        public List<Participant> getParticipants()
        {
            return participants;
        }
    }
}
