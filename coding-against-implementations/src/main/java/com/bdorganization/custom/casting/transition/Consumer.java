package com.bdorganization.custom.casting.transition;

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
        Appointment noDescriptionAppointment = new NoDescriptionAppointment(1L);

        /*
         * The first thing to check is whether or not the AppointmentManager's remove appointment method could just
         * remove the reference to the implementation altogether, such that it only relies on the interface. This is not
         * likely given that the casting is already happening, but it might be the case.
         * 
         * The other option that we can do is to promote the "getOrganizerName" up to the Appointment interface. While this is
         * technically "non-passive", you do have the benefit of knowing that no other implementation would have ever
         * been used to call the AppointmentManager's remove appointment method because it would have resulted in a
         * casting exception.
         * 
         * If the AppointmentManager's remove appointment method was the only usage of the Appointment interface then the
         * change is safe. Otherwise, additional work will have to be done (because other implementations could be
         * accepting appointment implementations provided by the consumer without casting).
         * 
         * If the method cannot be promoted because there are many other implementations of the Appointment class that can't reasonably 
         * add the new method, the last option would be to create an interface that extends the Appointment class and adds the additional method.
         * The AppointmentManager's remove appointment method should then be updated to use this.  See "alternative" package.
         */
        appointmentManager.removeAppointment(noDescriptionAppointment);
    }

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

        @Override
        public String getOrganizerName()
        {
            return "";
        }
    }
}
