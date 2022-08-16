package com.personal.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Entity
public class Jobs {
    @GeneratedValue
    @Id
    private Long id;

    private String name;

    @OneToMany
    private List<Players> playerList;
}
