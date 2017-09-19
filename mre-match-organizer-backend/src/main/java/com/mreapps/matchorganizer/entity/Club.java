package com.mreapps.matchorganizer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "club")
public class Club extends AbstractBaseEntity
{
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "user_club",
            joinColumns = @JoinColumn(name = "club_uid", referencedColumnName = "uid"),
            inverseJoinColumns = @JoinColumn(name = "user_uid", referencedColumnName = "uid")
    )
    private Set<User> users = new HashSet<>();
}
