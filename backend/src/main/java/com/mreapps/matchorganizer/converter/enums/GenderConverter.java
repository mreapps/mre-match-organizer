package com.mreapps.matchorganizer.converter.enums;

import com.mreapps.matchorganizer.enums.Gender;

import javax.persistence.AttributeConverter;

/**
 *
 */
public class GenderConverter implements AttributeConverter<Gender, Integer>
{
    @Override
    public Integer convertToDatabaseColumn(Gender gender)
    {
        return EnumWithIdConverter.getId(gender);
    }

    @Override
    public Gender convertToEntityAttribute(Integer id)
    {
        return EnumWithIdConverter.getValue(id, Gender.values());
    }
}
