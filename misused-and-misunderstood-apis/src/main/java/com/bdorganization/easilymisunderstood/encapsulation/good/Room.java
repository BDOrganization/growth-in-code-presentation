package com.bdorganization.easilymisunderstood.encapsulation.good;

public class Room
{
    private final long roomId;
    private final String roomDescription;
    private final boolean hasProjector;

    public Room(long roomId, String roomDescription, boolean hasProjector)
    {
        super();
        this.roomId = roomId;
        this.roomDescription = roomDescription;
        this.hasProjector = hasProjector;
    }

    public long getRoomId()
    {
        return roomId;
    }

    public String getRoomDescription()
    {
        return roomDescription;
    }

    public boolean isHasProjector()
    {
        return hasProjector;
    }
}
