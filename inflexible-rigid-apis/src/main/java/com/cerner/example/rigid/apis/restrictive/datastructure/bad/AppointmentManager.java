package com.cerner.example.rigid.apis.restrictive.datastructure.bad;

import java.util.List;

import com.cerner.example.rigid.apis.restrictive.datastructure.common.Appointment;
import com.cerner.example.rigid.apis.restrictive.datastructure.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    // List<AppointmentCriteria> assumes order is needed, but what if you're just iterating over elements
    List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
}
