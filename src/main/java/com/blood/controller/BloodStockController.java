package com.blood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bean.BloodStock;
import com.blood.repo.BloodStockRepo;
import com.blood.service.BloodStockService;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/stock")
public class BloodStockController {
	
	@Autowired
	BloodStockService serv;
	
	@PostMapping("/insertBlood")
	public ResponseEntity<String> doInsertBlood(@RequestBody BloodStock blood){
		try {
			serv.doInsert(blood);
			return ResponseEntity.ok("Inserted Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Insertion Failure");
		}
	}
	
	@PutMapping("/updateBlood")
	public ResponseEntity<String> doUpdateBlood(@RequestBody BloodStock blood){
		try {
			serv.doUpdate(blood);
			return ResponseEntity.ok("Updation Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Updation Failure");
		}
	}
	
	@DeleteMapping("/deleteBlood/{blId}")
	public ResponseEntity<String> doDeleteBlood(@PathVariable("blId")int blId){
		try {
			serv.doDelete(blId);
			return ResponseEntity.ok("Deletion Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Deletion Failure");
		}
	}
	
	@GetMapping("/findByBlood/{blGroup}")
	public List<BloodStock> doFindByBlood(@PathVariable("blGroup")String blGroup){
		return serv.doFindBloodGrp(blGroup);
	}
	
	
	@GetMapping("/findAllBlood")
	public List<BloodStock> doFindAllBlood(){
		return serv.doFindAll();
	}


}
