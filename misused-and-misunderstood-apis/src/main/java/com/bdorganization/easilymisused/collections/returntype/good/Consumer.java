package com.bdorganization.easilymisused.collections.returntype.good;

import java.util.Date;
import java.util.List;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    public static void main(String[] args)
    {
        AppointmentManager appointmentManager = new AppointmentManager();

        Date now = new Date();
        Date futureDate = new Date(now.getTime() + 1000000);
        Date pastDate = new Date(now.getTime() - 1000000);

        // appointmentManger returns dates contained in the collection, so everything works.
        for (Date date : appointmentManager.getAvailableBeginTimes(new Date(), futureDate))
        {
            System.out.println("Available time for appointment: " + date);
        }

        // In this situation, we do not have to perform any null checks because the collection will just be empty.
        List<Date> appointmentDates = appointmentManager.getAvailableBeginTimes(new Date(), pastDate);
        if (appointmentDates.isEmpty())
        {
            System.out.println("No dates found");
        }
        else
        {
            System.out.println("Dates found!");
        }

        /*
         * This NO LONGER THROWS A NULL POINTER EXCEPTION
         *
         * Because the returned collection is never null, we do not have to worry about slipping up and accidentally
         * passing the collection into the for loop and causing a NPE. In this situation, the for loop would essentially
         * be skipped over and no code would be executed inside of the for loop.
         */
        for (Date date : appointmentManager.getAvailableBeginTimes(new Date(), pastDate))
        {
            System.out.println("Available time for appointment: " + date);
        }
    }
}
