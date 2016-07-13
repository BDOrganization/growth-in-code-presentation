package com.bdorganization.easilymisused.inconsistentstate.good.builder;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

/**
 * This can usually just be a part of the implementation, but was extracted for
 * presentation purposes.
 */
public interface Builder {

    Builder id(long id);

    Builder description(String description);

    Builder participants(List<Participant> participants);

    Appointment build();
}