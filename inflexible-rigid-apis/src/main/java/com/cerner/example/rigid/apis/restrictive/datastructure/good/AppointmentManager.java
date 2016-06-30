package com.cerner.example.rigid.apis.restrictive.datastructure.good;

import java.util.Collection;

import com.cerner.example.rigid.apis.restrictive.datastructure.common.Appointment;
import com.cerner.example.rigid.apis.restrictive.datastructure.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    // Here we accept a collection (which would still allow for a list, but now we also
    // accept any collection implementation, such as set).
    // We might also consider returning a collection here as well if we have no desire to imply 
    // ordering is done in the returned list.
    Collection<Appointment> createAppointments(Collection<AppointmentCriteria> criteria);
}
