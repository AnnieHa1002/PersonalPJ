package com.personal.project.repository;

import com.personal.project.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playersRepository extends JpaRepository<Players, Long> {

}
