package com.personal.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Players {
    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private int age;

    private String info;

    @OneToOne
    private Jobs jobs;//왜 안되는 지 알아보자// 반대로 생각하라

    public Players (String name, int age, String info, Jobs jobs) {
        this.id=getId();
        this.name = name;
        this.age=age;
        this.info =info;
        this.jobs= jobs;
    }


}
