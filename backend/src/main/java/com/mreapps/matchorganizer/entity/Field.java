package com.mreapps.matchorganizer.entity;

import com.mreapps.matchorganizer.converter.enums.FieldSizeConverter;
import com.mreapps.matchorganizer.enums.FieldSize;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "field")
public class Field extends AbstractBaseEntity
{
    @ManyToOne
    @JoinColumn(name = "club_uid", nullable = false)
    private Club club;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "field_size", nullable = false)
    @Convert(converter = FieldSizeConverter.class)
    private FieldSize fieldSize;
}
