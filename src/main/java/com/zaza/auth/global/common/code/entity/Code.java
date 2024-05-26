package com.zaza.auth.global.common.code.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Table(name = "common.code")
@Entity
@Getter
public class Code {

    @Id
    @GeneratedValue
    @Column(name = "number")
    private int no;

    @Column(name = "group")
    private int codeGroupNo;

    private String name;

    private String label;

    private String description;

    private String status;

    private LocalDateTime registerDate;

    private LocalDateTime updateDate;
}
