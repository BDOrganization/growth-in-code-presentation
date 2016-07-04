package com.bdorganization.commontasks.bad;

import java.util.List;

import com.bdorganization.commontasks.common.Participant;

@SuppressWarnings({ "nls", "javadoc" })
public interface Appointment
{
    List<Participant> getParticipants();
}
