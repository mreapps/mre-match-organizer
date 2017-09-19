package com.mreapps.matchorganizer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "match")
public class Match extends AbstractBaseEntity
{
}
