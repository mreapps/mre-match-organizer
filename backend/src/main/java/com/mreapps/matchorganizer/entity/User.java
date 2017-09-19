package com.mreapps.matchorganizer.entity;

import com.mreapps.matchorganizer.converter.enums.RoleConverter;
import com.mreapps.matchorganizer.enums.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "\"user\"")
public class User extends AbstractBaseEntity
{
    @Column(name = "email_address", nullable = false, unique = true)
    private String emailAddress;

    @Column(name = "encrypted_password", nullable = false)
    private String encryptedPassword;

    @Column(name = "email_address_confirmed_at")
    private Date emailAddressConfirmedAt;

    @Column(name = "role", nullable = false)
    @Convert(converter = RoleConverter.class)
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "user_club",
            joinColumns = @JoinColumn(name = "user_uid", referencedColumnName = "uid"),
            inverseJoinColumns = @JoinColumn(name = "club_uid", referencedColumnName = "uid")
    )
    private Set<Club> clubs = new HashSet<>();
}
