package com.bdorganization.easilymisunderstood.typeabuse.transition.extramethod;

import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.FRIDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.MONDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.SATURDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.SUNDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.THURSDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.TUESDAY;
import static com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek.WEDNESDAY;

import java.util.HashSet;
import java.util.Set;

import com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek;

@SuppressWarnings("javadoc")
public class RecurringAppointment {
    private final long appointmentId;
    private final String recurrence;

    public RecurringAppointment(long appointmentId, String recurrence) {
        this.appointmentId = appointmentId;
        this.recurrence = recurrence;
    }

    /**
     * @return the identifier of the appointment.
     */
    public long getAppointmentId() {
        return appointmentId;
    }

    /**
     * @return string representing the days of the week. For the day of the week that the
     *         recurrence is on, an 'X' character will be present. For days of the week
     *         that there is no recurrence, a space character will be present.
     * @deprecated use {@link #getWeeklyRecurrenceAsSet()} instead
     */
    @Deprecated
    public String getWeeklyRecurrence() {
        return recurrence;
    }

    public Set<DayOfWeek> getWeeklyRecurrenceAsSet() {
        Set<DayOfWeek> daysOfWeekToReturn = new HashSet<DayOfWeek>();
        for (int i = 0; i < recurrence.length(); i++) {
            if (recurrence.charAt(i) != 'X') {
                continue;
            }

            switch (i) {
                case 0:
                    daysOfWeekToReturn.add(SUNDAY);
                    break;
                case 1:
                    daysOfWeekToReturn.add(MONDAY);
                    break;
                case 2:
                    daysOfWeekToReturn.add(TUESDAY);
                    break;
                case 3:
                    daysOfWeekToReturn.add(WEDNESDAY);
                    break;
                case 4:
                    daysOfWeekToReturn.add(THURSDAY);
                    break;
                case 5:
                    daysOfWeekToReturn.add(FRIDAY);
                    break;
                case 6:
                    daysOfWeekToReturn.add(SATURDAY);
                    break;
            }
        }
        return daysOfWeekToReturn;
    }
}
