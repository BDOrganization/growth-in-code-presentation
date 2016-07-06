package com.bdorganization.easilymisunderstood.typeabuse.bad;

public class Consumer
{
    /*
     * There are really a few concerns that come out of this code.  First, hopefully we have the casing correct.  What
     * if it was 'x' instead of 'X'.  Another consideration that we have to deal with is whether or not the recurrence pattern
     * started with SUNDAY or started with MONDAY.  
     * 
     * There is also some cognitive friction here because most APIs (joda-time and Calendar) represent the day of the week
     * as 1 - 7.  However, we're pulling from index 0 - 6.  
     */
    
    public void consume(RecurringAppointment recurringAppointment)
    {
        String recurrence = recurringAppointment.weeklyRecurrence();
        for (int i = 0; i < recurrence.length(); i++)
        {
            char recurrenceChar = recurrence.charAt(i);
            if (recurrenceChar != 'X')
            {
                continue;
            }

            switch (i)
            {
            case 0:
                System.out.println("ASSUME SUNDDAY");
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
