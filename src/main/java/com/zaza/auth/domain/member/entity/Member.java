package com.zaza.auth.domain.member.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@Entity
@Table(name = "common.member")
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "number")
    private Long no;

    @Column(name = "id")
    private String memberId;

    private String name;

    private String password;

    private String phone;

    private String email;

    private Integer age;

    private String role;

    private String status;

    private LocalDateTime registerDate;

    private LocalDateTime updateDate;

    public Member() {
    }

    public Member(Long no, String memberId, String name, String password, String phone, String email,
                  Integer age, String role, String status, LocalDateTime registerDate, LocalDateTime updateDate) {
        this.no = no;
        this.memberId = memberId;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.role = role;
        this.status = status;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
    }
}

