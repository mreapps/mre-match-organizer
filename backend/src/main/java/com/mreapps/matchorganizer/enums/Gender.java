package com.mreapps.matchorganizer.enums;

/**
 *
 */
public enum Gender implements EnumWithId
{
    MALE(1),
    FEMALE(2),
    MIX(3);

    private int id;

    Gender(int id)
    {
        this.id = id;
    }

    @Override
    public int getId()
    {
        return id;
    }
}
