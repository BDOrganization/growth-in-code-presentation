package com.bdorganization.commontasks.good;

import java.util.List;

import com.bdorganization.commontasks.common.Participant;

public interface Participants
{
    List<Participant> getAllParticipants();
    
    List<Participant> getAllBookedParticipants();
    
    List<Participant> getAllConflictedParticipants();
}
