package com.bdorganization.commontasks.common;

@SuppressWarnings({ "javadoc" })
public interface Participant
{
    /**
     * @return the name of the participant.
     */
    String getName();

    /**
     * @return {@code true} if the participant is successfully booked, {@code false} otherwise.
     */
    boolean isBooked();

    /**
     * @return {@code true} if the participant could not be booked because there was a conflict, {@code false}
     *         otherwise.
     */
    boolean isConflicted();
}
