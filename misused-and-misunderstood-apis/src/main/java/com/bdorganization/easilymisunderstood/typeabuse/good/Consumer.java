package com.bdorganization.easilymisunderstood.typeabuse.good;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    /*
     * If we are using an enumeration, there is no concern for confusion. SUNDAY means Sunday. Consumers are not
     * required to do any translation on their own.
     */
    public void consume(RecurringAppointment recurringAppointment)
    {
        for (DayOfWeek dayOfWeek : recurringAppointment.getWeeklyRecurrence())
        {
            switch (dayOfWeek)
            {
                case SUNDAY:
                    System.out.println("ASSUME SUNDAY");
                    break;
                case MONDAY:
                    System.out.println("ASSUME MONDAY");
                    break;
                case TUESDAY:
                    System.out.println("ASSUME TUESDAY");
                    break;
                case WEDNESDAY:
                    System.out.println("ASSUME WEDNESDAY");
                    break;
                case THURSDAY:
                    System.out.println("ASSUME THURSDAY");
                    break;
                case FRIDAY:
                    System.out.println("ASSUME FRIDAY");
                    break;
                case SATURDAY:
                    System.out.println("ASSUME SATURDAY");
                    break;
            }
        }
    }
}
