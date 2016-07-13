package com.bdorganization.leaky.abstractions;

import java.sql.SQLException;

public interface AppointmentManager
{
    /**
     * Exceptions on the method signature can expose the implementation.
     */
    AppointmentRemoveStatus removeAppointment(Appointment appointment) throws SQLException;

    /**
     * Method names can expose the implementation.
     */
    AppointmentRemoveStatus removeAppointmentFromDatabase(Appointment appointment);

    /**
     * Same as above. What if we wanted the remove to be performed from a hyperlink, checkbox, or something else
     * instead?
     */
    AppointmentRemoveStatus removeButtonClicked();

    /*
     * What if we want to call a rest service instead? or we decide to move to a different database model and the names
     * do not match up, etc. This method documentation is giving WAY too much information.
     */
    /**
     * Removes the appointment from appointments table in the database where the {@code appointmentId} matches app_id.
     * 
     * @param appointmentId
     *            The id matching the app_id in the appointments table.
     * @return the status of the removal.
     */
    AppointmentRemoveStatus removeAppointment(long appointmentId);

    /**
     * Removes the specified appointment.
     * 
     * @param appointment
     *            The appointment to be removed.
     * 
     * @return the status of the appointment removal. This will be formatted as a JSON string with a property called
     *         {@code status} and a value of either {@code SUCCESS} or {@code FAILURE}.
     */
    String removeSingleAppointment(Appointment appointment);
}