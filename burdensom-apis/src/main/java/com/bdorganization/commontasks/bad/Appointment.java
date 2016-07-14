package com.bdorganization.commontasks.bad;

import java.util.List;

import com.bdorganization.commontasks.common.Participant;

@SuppressWarnings({ "javadoc" })
public interface Appointment {
    List<Participant> getParticipants();
}
