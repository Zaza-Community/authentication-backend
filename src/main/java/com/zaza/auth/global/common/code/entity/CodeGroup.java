package com.zaza.auth.global.common.code.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Table(name = "common.code_group")
@Entity
@Getter
public class CodeGroup {

    @Id
    @GeneratedValue
    @Column(name = "number")
    private int number;

    private String name;

    private String prefix;

    private String description;

    private String status;

    private LocalDateTime registerDate;

    private LocalDateTime updateDate;
}
