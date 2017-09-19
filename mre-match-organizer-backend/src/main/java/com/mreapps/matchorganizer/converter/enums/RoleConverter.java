package com.mreapps.matchorganizer.converter.enums;

import com.mreapps.matchorganizer.enums.Role;

import javax.persistence.AttributeConverter;

/**
 *
 */
public class RoleConverter implements AttributeConverter<Role, Integer>
{
    @Override
    public Integer convertToDatabaseColumn(Role role)
    {
        return role == null ? null : role.getId();
    }

    @Override
    public Role convertToEntityAttribute(Integer id)
    {
        return EnumWithIdConverter.getValue(id, Role.values());
    }
}
