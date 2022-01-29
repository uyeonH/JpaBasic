package com.study.jpabasic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Member {

    @Id
    private Long id;
    private String name;

}
