package com.bdorganization.restrictive.datastructure.bad;

import java.util.List;

import com.bdorganization.restrictive.datastructure.common.Appointment;
import com.bdorganization.restrictive.datastructure.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    // List<AppointmentCriteria> assumes order is needed, but what if you're just iterating over elements
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
