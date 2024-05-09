package com.blood.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood.bean.BloodDonor;

public interface BloodDonorRepo extends JpaRepository<BloodDonor, Integer> {

}
