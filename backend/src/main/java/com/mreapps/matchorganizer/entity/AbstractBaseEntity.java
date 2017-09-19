package com.mreapps.matchorganizer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 *
 */
@MappedSuperclass
@Data
public abstract class AbstractBaseEntity implements BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid", nullable = false)
    @JsonIgnore
    private Long id;
}
