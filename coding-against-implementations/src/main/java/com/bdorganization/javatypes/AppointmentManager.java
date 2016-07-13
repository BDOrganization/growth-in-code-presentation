package com.bdorganization.javatypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface AppointmentManager
{
    /**
     * Use List instead...
     */
    ArrayList<AppointmentRemoveStatus> removeAppointments(List<Appointment> appointment);

    /**
     * HashSet is an implementation, use HashSet instead.
     */
    Set<AppointmentRemoveStatus> removeAppointments(HashSet<Appointment> appointment);
}