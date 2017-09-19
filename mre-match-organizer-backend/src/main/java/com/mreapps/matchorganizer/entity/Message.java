package com.mreapps.matchorganizer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "message")
public class Message extends AbstractBaseEntity
{
    @ManyToOne
    @JoinColumn(name = "user_uid", nullable = false)
    private User user;

    @Column(name = "sender", length = 50, nullable = false)
    private String sender;

    @Column(name = "recipient", length = 50, nullable = false)
    private String recipient;

    @Column(name = "message_body", nullable = false)
    private String messageBody;

    @Column(name = "message_sent", nullable = false)
    private Date messageSent;
}
