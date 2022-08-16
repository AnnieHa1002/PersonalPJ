package com.personal.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Places {
    @GeneratedValue
    @Id
    private Long id;

    private String name;
}
