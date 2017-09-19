package com.mreapps.matchorganizer.security.model;

import com.mreapps.matchorganizer.enums.Role;
import lombok.Data;

/**
 *
 */
@Data
public class User
{
    private Long id;
    private String emailAddress;
    private Role role;
    private boolean verified;
}
