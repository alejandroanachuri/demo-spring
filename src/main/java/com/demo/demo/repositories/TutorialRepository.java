package com.demo.demo.repositories;

import com.demo.demo.domains.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Tutorial repository</p>
 * @date 2022-07-22 15:40
 **/
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
