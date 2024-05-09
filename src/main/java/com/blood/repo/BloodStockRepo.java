package com.blood.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood.bean.BloodStock;

import jakarta.transaction.Transactional;

public interface BloodStockRepo extends JpaRepository<BloodStock, Integer> {
	
	@Transactional
	public List<BloodStock> findByBlGroup(String blGroup);

}
