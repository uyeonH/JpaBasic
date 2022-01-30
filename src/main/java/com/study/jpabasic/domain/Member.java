package com.study.jpabasic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "LOCKER_ID ")
    private Locker locker;

}
