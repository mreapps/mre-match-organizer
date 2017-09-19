package com.mreapps.matchorganizer.entity;

import com.mreapps.matchorganizer.converter.enums.FieldSizeConverter;
import com.mreapps.matchorganizer.enums.FieldSize;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "team_class")
public class TeamClass extends AbstractBaseEntity
{
    @Column(name = "abbreviation", length = 10, nullable = false, unique = true)
    private String abbreviation;

    @Column(name = "name", length = 20, nullable = false, unique = true)
    private String name;

    @Column(name = "field_size", nullable = false)
    @Convert(converter = FieldSizeConverter.class)
    private FieldSize fieldSize;
}
