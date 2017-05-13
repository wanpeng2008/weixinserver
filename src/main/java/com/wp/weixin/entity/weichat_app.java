package com.wp.weixin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 万鹏 on 2017/5/13.
 */
@Entity
@Table(name = "WEICHAT_APP")
public class weichat_app {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    @JsonIgnore
    private UUID id;
    @Column(name = "APP_ID",nullable=false,unique=true)
    private String appId;
    @Column(name = "SECRET",nullable = false)
    private String secret;
    @Column(name = "TOKEN",nullable=false)
    private String token;
    @Column(name = "ASE_KEY",nullable=false)
    private String aseKey;
    @Column(name = "ACCESS_PATH",nullable=false,unique=true)
    private String accessPath;

}
