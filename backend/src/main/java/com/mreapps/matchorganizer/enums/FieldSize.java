package com.mreapps.matchorganizer.enums;

/**
 *
 */
public enum FieldSize implements EnumWithId
{
    THREE_A_SIDE(3),
    FIVE_A_SIDE(5),
    SEVEN_A_SIDE(7),
    NINE_A_SIDE(9),
    ELEVEN_A_SIDE(11);

    private int id;

    FieldSize(int id)
    {
        this.id = id;
    }

    @Override
    public int getId()
    {
        return id;
    }
}
