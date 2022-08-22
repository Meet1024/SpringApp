package com.meet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.meet.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
