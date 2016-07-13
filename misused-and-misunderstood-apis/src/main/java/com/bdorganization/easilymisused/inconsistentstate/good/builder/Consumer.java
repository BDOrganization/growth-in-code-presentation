package com.bdorganization.easilymisused.inconsistentstate.good.builder;

import java.util.List;

import com.bdorganization.easilymisused.inconsistentstate.common.Participant;

@SuppressWarnings({ "javadoc", "nls" })
public class Consumer {
    /**
     * The builder pattern can also be used to enforce consistent (and immutable) state.
     * The benefit of combining builder pattern and consistent state is that we now do not
     * have to specify all fields (and thus the permutations of fields is limited), but we
     * can guarantee certain things about the fields.
     * 
     * In the following example, we do not specify participants, but the
     * consumeParticipants method which uses the participants in a for loop does not throw
     * an exception because the Participants is massaged to an empty value.
     */
    public void consumeBuilder() {
        Builder builder = new DefaultAppointment.DefaultBuilder();
        builder.description("appointment 1");
        builder.id(2);
        Appointment appointment = builder.build();

        consume(appointment);
        consumeParticipants(appointment);
    }

    public void consumeBuilderChaining() {
        Appointment appointment = new DefaultAppointment.DefaultBuilder()
                .description("appointment 1").id(2).build();

        consume(appointment);
        consumeParticipants(appointment);
    }

    public void consumeBuilderAllFields(List<Participant> participants) {
        Builder builder = new DefaultAppointment.DefaultBuilder();
        builder.description("appointment 1");
        builder.id(2);
        builder.participants(participants);
        Appointment appointment = builder.build();

        consume(appointment);
        consumeParticipants(appointment);
    }

    public void consume(Appointment appointment) {
        System.out.println("Appointment Description Length: "
                + appointment.getDescription().length());
    }

    public void consumeParticipants(Appointment appointment) {
        for (Participant participant : appointment.getParticipants()) {
            System.out.println("Participant: " + participant.getName());
        }
    }
}
