package com.cg.dms.repository;

import com.cg.dms.entities.Farmer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IFarmerRepository extends JpaRepository<Farmer, Integer> {

}