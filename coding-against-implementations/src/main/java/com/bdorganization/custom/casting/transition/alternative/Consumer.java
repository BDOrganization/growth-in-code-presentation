package com.bdorganization.custom.casting.transition.alternative;

@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consumeOnlyPublicMethods()
    {
        RemovableAppointment noDescriptionAppointment = new NoDescriptionAppointment(1L);
        /*
         * This is non-passive, but as long as the DefaultAppointment can be changed to implement the new interface, we
         * know for sure that this will work since we know that all consumers of the remove appointment method already
         * have the additional method that is on the DefaultAppointment class (since it was casting to it already).
         * 
         * Now consumers can provide their own implementation if they so choose.
         */
        appointmentManager.removeAppointment(noDescriptionAppointment);
    }

    private static class NoDescriptionAppointment implements RemovableAppointment
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

        @Override
        public String getOrganizerName()
        {
            return "";
        }
    }
}
