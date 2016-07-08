package com.bdorganization.easilymisunderstood.typeabuse.transition.utility;

import java.util.Set;

import com.bdorganization.easilymisunderstood.typeabuse.transition.common.DayOfWeek;

/**
 * One approach that can be taken is to create a utility that will translate from the numerical value into the strongly
 * typed {@link DayOfWeek} enumeration.
 * 
 * Pros:
 * <ul>
 * <li>the code to perform the translation is in a API (instead of each consumer having their own)</li>
 * <li>you can handle the translation to and from the numerical form in the same API</li>
 * <li>every consumer is not required to re-implement the approach</li>
 * </ul>
 * 
 * Cons:
 * <ul>
 * <li>usage of the utility is not required, consumers might not even know that it exists</li>
 * <li>if there are many different representations of numerical days of week, the utility API can become bloated and
 * confusing very quickly. For example, if we are translating for a 0 based index that starts with Sunday, how would we
 * name it differently than if we were translating for a 1 based that starts with Sunday?</li>
 * </ul>
 * 
 * Additional thoughts: This has good and bad parts to it, but this approach puts the burden all on the consumer of the
 * API that is returned the type abused representation of the day of week. This is bad because the API is still abusing
 * types. It is "good" because the change is passive to all consumers and requires no code change on the producing API.
 * This means that if you are not in control of the "RecurringAppointment" class then you have less work to do when
 * compared to updating all consumers.
 * 
 */
@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private final DayOfWeekTranslator dayOfWeekTranslator = new DayOfWeekTranslator();

    public void consume(RecurringAppointment appointment)
    {
        Set<DayOfWeek> recurringDaysOfWeek = dayOfWeekTranslator.translateDaysOfWeek(appointment.getWeeklyRecurrence());

        // do something else with recurring days of week
        System.out.println(recurringDaysOfWeek);
    }
}
