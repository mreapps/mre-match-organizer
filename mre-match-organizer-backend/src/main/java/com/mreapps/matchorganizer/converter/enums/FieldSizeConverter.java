package com.mreapps.matchorganizer.converter.enums;

import com.mreapps.matchorganizer.enums.FieldSize;

import javax.persistence.AttributeConverter;

/**
 *
 */
public class FieldSizeConverter implements AttributeConverter<FieldSize, Integer>
{
    @Override
    public Integer convertToDatabaseColumn(FieldSize fieldSize)
    {
        return EnumWithIdConverter.getId(fieldSize);
    }

    @Override
    public FieldSize convertToEntityAttribute(Integer id)
    {
        return EnumWithIdConverter.getValue(id, FieldSize.values());
    }
}
