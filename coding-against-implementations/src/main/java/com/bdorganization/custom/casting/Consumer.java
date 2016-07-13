package com.bdorganization.custom.casting;

@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consumePublicAndImplMethods()
    {
        Appointment noDescriptionAppointment = new NoDescriptionAppointment(1L);

        /*
         * This is worse... This has effectively made it such that the appointment manager can accept other
         * implementations (it is not enforced at compile time) but when the code is actually ran, a runtime exception
         * will occur because the NoDescriptionAppointment cannot be cast to the DefaultAppointment.
         */
        appointmentManager.removeAppointment(noDescriptionAppointment);
    }

    /**
     * Consumer's custom implementation of the Appointment interface.
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
            return "";
        }
    }
}
