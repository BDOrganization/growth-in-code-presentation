package com.bdorganization.easilymisused.strongtype.good;

@SuppressWarnings({ "javadoc" })
public interface ParticipantScheduleManager
{
    ParticipantSchedule getParticipantSchedule(ParticipantIdentifier participantId);

    ParticipantSchedule getParticipantSchedule(Participant participant);
}
