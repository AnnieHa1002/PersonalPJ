package com.personal.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
public class Players {
    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private int age;

    private String info;

    @OneToOne
    private Jobs jobs;



}
