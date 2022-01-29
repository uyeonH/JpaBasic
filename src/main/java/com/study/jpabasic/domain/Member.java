package com.study.jpabasic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Member {

    @GeneratedValue
    @Id
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(nullable = false)
    private String name;
    private String city;
    private String street;
    private String zipcode;
    private Integer age;
    @ManyToOne
    private Team team;


}
