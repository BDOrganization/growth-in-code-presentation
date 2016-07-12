package com.bdorganization.easilymisused.inconsistentstate.bad;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer
{
    /**
     * Given that the appointment constructor has no null checking for the description of the appointment and it also
     * has a "setter" method, we cannot guarantee that the following line does not result in a null pointer exception.
     * 
     * If it is reasonable that the description should never actually be null, then it feels odd to have consumers check
     * it every time that they use it. This likely means that consumers would also forget to null check it before
     * consumption as well, allowing for the possibility of a null pointer exception.
     */
    public void consume(Appointment appointment)
    {
        System.out.println("Appointment Description Length: " + appointment.getDescription().length());
    }

    /**
     * Given that we can't just consume the appointment's description because it will result in a null pointer exception
     * we are forced to perform a null checks around every consumption of it. There might be situations where this does
     * not apply, but consumers always have to be considering whether or not consuming this object will result in a null
     * pointer exception. Further, they are forced to make a decision on what to do if description is null (when it
     * logically should never be null). Should the workflow be terminated because it could have downstream effects? Show
     * an empty string instead? etc.
     * 
     * Another thing to consider is how distracting all of these checks now become. Out of the entire method's body
     * below, only 1/3 (or 1/4 based on formatting) of the lines within the method are actually relevant. Only one line
     * really communicates the intent of the consumer (which is to print the length of the description).
     * 
     * Finally, consider the appointment object used in multiple threads. Given the ability to set the description, at
     * no point can you guarantee the state of the appointment. Imagine that this method was called. The null check is
     * performed and it appears to be safe, but between the null check and the print statement, the other thread
     * modifies the appointment to have a null description, the consumeNullSafe method now will throw a
     * NullPointerException when the print statement is called.
     * 
     */
    public void consumeNullSafe(Appointment appointment)
    {
        if (appointment.getDescription() != null)
        {
            System.out.println("Appointment Description Length: " + appointment.getDescription().length());
        }
    }
}
