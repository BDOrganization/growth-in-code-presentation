package com.cerner.example.rigid.apis.restrictive.datastructure.transition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;

import com.cerner.example.rigid.apis.restrictive.datastructure.common.AppointmentCriteria;

public class AppointmentManagerTest
{
    private AppointmentManager manager = Mockito.mock(AppointmentManager.class);

    @Test
    public void testCreateAppointments_regressionTestEnsuringListStillWorks()
    {
        List<AppointmentCriteria> criteria = new ArrayList<AppointmentCriteria>();

        // if it compiles, that means that the change was passive.
        manager.createAppointments(criteria);
    }

    @Test
    public void testCreateAppointments_collection()
    {
        Collection<AppointmentCriteria> criteria = Collections.<AppointmentCriteria> emptyList();

        // collections works!
        manager.createAppointments(criteria);
    }
    
    @Test
    public void testCreateAppointments_set()
    {
        Set<AppointmentCriteria> criteria = new HashSet<AppointmentCriteria>();

        // collections works!
        manager.createAppointments(criteria);
    }
}
