package com.bdorganization.easilymisunderstood.typeabuse.good;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer {
    /*
     * If we are using an enumeration, there is no concern for confusion. SUNDAY means
     * Sunday. Consumers are not required to do any translation on their own.
     */
    public void consume(RecurringAppointment recurringAppointment) {
        for (DayOfWeek dayOfWeek : recurringAppointment.getWeeklyRecurrence()) {
            switch (dayOfWeek) {
                case SUNDAY:
                    System.out.println("DEFINITELY SUNDAY");
                    break;
                case MONDAY:
                    System.out.println("DEFINITELY MONDAY");
                    break;
                case TUESDAY:
                    System.out.println("DEFINITELY TUESDAY");
                    break;
                case WEDNESDAY:
                    System.out.println("DEFINITELY WEDNESDAY");
                    break;
                case THURSDAY:
                    System.out.println("DEFINITELY THURSDAY");
                    break;
                case FRIDAY:
                    System.out.println("DEFINITELY FRIDAY");
                    break;
                case SATURDAY:
                    System.out.println("DEFINITELY SATURDAY");
                    break;
            }
        }
    }
}
