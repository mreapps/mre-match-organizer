package com.mreapps.matchorganizer.entity;

import com.mreapps.matchorganizer.converter.enums.RoleConverter;
import com.mreapps.matchorganizer.enums.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "\"user\"")
public class User extends AbstractBaseEntity
{
    @Column(name = "phone_number", length = 20, nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "encrypted_password", nullable = false)
    private String encryptedPassword;

    @Column(name = "phone_number_confirmed_at")
    private Date phoneNumberConfirmedAt;

    @Column(name = "role", nullable = false)
    @Convert(converter = RoleConverter.class)
    private Role role;
}
