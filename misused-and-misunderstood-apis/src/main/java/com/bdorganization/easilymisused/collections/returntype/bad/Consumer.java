package com.bdorganization.easilymisused.collections.returntype.bad;

import java.util.Collection;
import java.util.Date;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer {
    public static void main(String[] args) {
        AppointmentManager appointmentManager = new AppointmentManager();

        Date now = new Date();
        Date futureDate = new Date(now.getTime() + 1000000);
        Date pastDate = new Date(now.getTime() - 1000000);

        // appointmentManger returns dates contained in the collection, so everything
        // works.
        for (Date date : appointmentManager.getAvailableBeginTimes(new Date(),
                futureDate)) {
            System.out.println("Available time for appointment: " + date);
        }
        // Let's assume that the consumer is diligent and read the documentation that
        // indicated that
        // getAvailableBeginTimes would return null. They would then have to do the
        // following code:
        Collection<Date> appointmentDates = appointmentManager
                .getAvailableBeginTimes(new Date(), pastDate);
        if (appointmentDates != null) {
            // this would never get hit because the "getAvailableBeginTimes" method will
            // return null for dates in the
            // past for the end date.
            if (appointmentDates.isEmpty()) {
                System.out.println("No dates found");
            }
            else {
                System.out.println("Dates found!");
            }
        }

        /*
         * THIS THROWS A NULL POINTER EXCEPTION
         * 
         * In this situation, the consumer forgot that enhanced for loops will ultimately
         * call the Collection#iterator method, which given that the returned collection
         * is null, will result in a NPE. This situations is a little bit harder to spot
         * given that the consumer is not directly calling a method on the provided
         * collection and might not throw a red flag to indicate a NPE is possible.
         */
        Collection<Date> dates = appointmentManager.getAvailableBeginTimes(new Date(),
                pastDate);
        if (dates != null) {
            for (Date date : dates) {
                System.out.println("Available time for appointment: " + date);
            }
        }
    }
}
