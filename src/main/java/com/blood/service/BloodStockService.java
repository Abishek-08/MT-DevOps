package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bean.BloodStock;
import com.blood.repo.BloodStockRepo;

@Service
public class BloodStockService {
	
	@Autowired
	BloodStockRepo repo;
	
	public boolean doInsert(BloodStock stock) {
		try {
			repo.save(stock);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean doUpdate(BloodStock stock) {
		try {
			repo.save(stock);
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
	
	public List<BloodStock> doFindBloodGrp(String bldGrp){
		return repo.findByBlGroup(bldGrp);
	}
	
	public List<BloodStock> doFindAll() {
		return repo.findAll();
	}
	
	

}
