package com.universitymaps.university.repositories;

import com.universitymaps.university.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniversityRepository extends JpaRepository<University,Integer> {

}
