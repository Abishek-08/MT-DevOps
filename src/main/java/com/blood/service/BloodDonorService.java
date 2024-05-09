package com.blood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bean.BloodDonor;
import com.blood.repo.BloodDonorRepo;

@Service
public class BloodDonorService {
	
	@Autowired
	BloodDonorRepo repo;
	
	public boolean doInsert(BloodDonor donor) {
		try {
			repo.save(donor);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean doUpdate(BloodDonor donor) {
		try {
			repo.save(donor);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean doDelete(int id) {
		try {
			repo.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public Optional<BloodDonor> doFindDonorId(int id){
		return repo.findById(id);
	}
	
	public List<BloodDonor> doFindAll() {
		return repo.findAll();
	}
	

}
