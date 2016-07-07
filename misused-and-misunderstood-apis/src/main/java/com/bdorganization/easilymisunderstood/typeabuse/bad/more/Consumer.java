package com.bdorganization.easilymisunderstood.typeabuse.bad.more;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{

    /*
     * As it is right now, we are relying on a gentleman's contract that 0 will be used as Sunday and that 1 will be
     * used as Monday.
     * 
     * Nothing at compile time actually ties the 0 integer to a phrase of SUNDAY. This becomes even worse when an API
     * requires that a "day of week" be specified and only accepts an integer value.
     */
    public void consume(RecurringAppointment recurringAppointment)
    {
        for (Integer dayOfWeek : recurringAppointment.getWeeklyRecurrence())
        {
            switch (dayOfWeek)
            {
                case 0:
                    System.out.println("ASSUME SUNDAY");
                    // Or was this Monday? Perhaps Sunday was supposed to be 1
                    break;
                case 1:
                    System.out.println("ASSUME MONDAY");
                    break;
                case 2:
                    System.out.println("ASSUME TUESDAY");
                    break;
                case 3:
                    System.out.println("ASSUME WEDNESDAY");
                    break;
                case 4:
                    System.out.println("ASSUME THURSDAY");
                    break;
                case 5:
                    System.out.println("ASSUME FRIDAY");
                    break;
                case 6:
                    System.out.println("ASSUME SATURDAY");
                    break;
            }
        }
    }
}
