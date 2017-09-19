package com.mreapps.matchorganizer.entity;

import com.mreapps.matchorganizer.converter.enums.GenderConverter;
import com.mreapps.matchorganizer.enums.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "team")
public class Team extends AbstractBaseEntity
{
    @ManyToOne
    @JoinColumn(name = "club_uid", nullable = false)
    private Club club;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_class_uid", nullable = false)
    private TeamClass teamClass;

    @Column(name = "gender", nullable = false)
    @Convert(converter = GenderConverter.class)
    private Gender gender;
}
