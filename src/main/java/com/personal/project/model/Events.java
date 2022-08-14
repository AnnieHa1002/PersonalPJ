package com.personal.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
public class Events {
    @GeneratedValue
    @Id
    private Long id;

    private String name;
}
