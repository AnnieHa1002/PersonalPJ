package com.personal.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Events {
    @GeneratedValue
    @Id
    private Long id;

    private String name;
}
