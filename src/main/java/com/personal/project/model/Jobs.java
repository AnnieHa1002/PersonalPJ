package com.personal.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
public class Jobs {
    @GeneratedValue
    @Id
    private Long id;

    private String name;
}
