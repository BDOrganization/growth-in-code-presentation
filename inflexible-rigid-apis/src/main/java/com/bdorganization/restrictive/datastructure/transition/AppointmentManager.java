package com.bdorganization.restrictive.datastructure.transition;

import java.util.Collection;

import com.bdorganization.restrictive.datastructure.common.Appointment;
import com.bdorganization.restrictive.datastructure.common.AppointmentCriteria;

@SuppressWarnings({ "javadoc" })
public interface AppointmentManager
{
    /*
     * Method previously had signature of the following:
     * 
     * List<Appointment> createAppointments(List<AppointmentCriteria> criteria);
     * 
     * We need to ensure that those providing a list still works... While we could look to our consumers and hope that
     * after future revisions, it will continue to work, or we could write tests that ensure the implementations our
     * consumers are using still work pro-actively. Writing API tests for this is incredibly helpful.
     * 
     * See /inflexible-rigid-apis/src/test/java/com/cerner/example/rigid/apis/restrictive/datastructure/transition/
     * AppointmentManagerTest.java
     */
    Collection<Appointment> createAppointments(Collection<AppointmentCriteria> criteria);
}
