package com.bdorganization.commontasks.common;

import java.util.ArrayList;
import java.util.List;

/**
 * This is just a simple class for creating fake data. It is here so that it does not have to be duplicated and that it
 * is not distracting from the important code.
 */
public class MockParticipantData
{
    public static List<Participant> createMockParticipants()
    {
        List<Participant> participantsToReturn = new ArrayList<Participant>();
        participantsToReturn.add(new ParticipantImpl("Dustin1", true, false));
        participantsToReturn.add(new ParticipantImpl("Dustin2", true, false));
        participantsToReturn.add(new ParticipantImpl("Brandon1", false, true));
        participantsToReturn.add(new ParticipantImpl("Brandon2", false, true));
        participantsToReturn.add(new ParticipantImpl("Brandon3", true, true));
        return participantsToReturn;
    }

    private static class ParticipantImpl implements Participant
    {
        private final String name;
        private final boolean isConflicted;
        private final boolean isBooked;

        public ParticipantImpl(String name, boolean isConflicted, boolean isBooked)
        {
            this.name = name;
            this.isConflicted = isConflicted;
            this.isBooked = isBooked;
        }

        public String getName()
        {
            return name;
        }

        public boolean isConflicted()
        {
            return isConflicted;
        }

        public boolean isBooked()
        {
            return isBooked;
        }

        @Override
        public String toString()
        {
            return "ParticipantImpl [name=" + name + ", isConflicted=" + isConflicted + ", isBooked=" + isBooked + "]";
        }
    }
}
