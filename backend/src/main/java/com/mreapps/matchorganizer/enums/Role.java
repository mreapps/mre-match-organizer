package com.mreapps.matchorganizer.enums;

/**
 *
 */
public enum Role implements EnumWithId
{
    USER(1),
    ADMIN(9);

    private int id;

    Role(int id)
    {
        this.id = id;
    }

    @Override
    public int getId()
    {
        return id;
    }
}
