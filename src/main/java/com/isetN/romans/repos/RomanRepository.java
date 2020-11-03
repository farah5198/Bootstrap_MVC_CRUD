package com.isetN.romans.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetN.romans.entities.Roman;

public interface RomanRepository extends JpaRepository<Roman,Long> {

}
