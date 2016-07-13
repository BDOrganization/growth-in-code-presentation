package com.bdorganization.custom.bad;

@SuppressWarnings({ "javadoc", "unused" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consumeOnlyPublicMethods()
    {
        Appointment noDescriptionAppointment = new NoDescriptionAppointment(1L);

        /*
         * DOES NOT COMPILE! Even though the appointment manager likely only needs the methods on the interface, the
         * AppointmentManager requires the DefaultAppointment and limits consumers such that they cannot specify a
         * different implementation.
         * 
         * In this code situation, the solution is simple. Make AppointmentManager's remove appointment method take in
         * an Appointment.
         */
        // appointmentManager.removeAppointment(noDescriptionAppointment);
    }

    /**
     * Consumers custom implementation of the Appointment interface.
     */
    private static class NoDescriptionAppointment implements Appointment
    {
        private final long id;

        public NoDescriptionAppointment(long id)
        {
            this.id = id;
        }

        @Override
        public long getId()
        {
            return id;
        }

        @Override
        public String getDescription()
        {
            return null;
        }
    }
}
