package com.blood;



import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blood.bean.BloodDonor;
import com.blood.bean.BloodStock;
import com.blood.service.BloodDonorService;
import com.blood.service.BloodStockService;

@SpringBootTest
class SbMTestAssessmentApplicationTests {
	
	@Autowired
	BloodStockService serv;

	//@Test
	@Ignore
	void test_InsertStock() {
		BloodDonor donor = new BloodDonor();
		donor.setDnrId(10);
		
		BloodStock stock = new BloodStock();
		stock.setBlCount("190");
		stock.setBlGroup("B+ve");
		stock.setBlRBC("789mgh");
		stock.setBlWBC("354mgh");
		stock.setDonor(donor);
		
		boolean result = serv.doInsert(stock);
		assertEquals(true, result);
		
	}
	
	//@Test
	@Ignore
	void test_UpdateStock() {
		BloodDonor donor = new BloodDonor();
		donor.setDnrId(10);
		
		BloodStock stock = new BloodStock();
		stock.setBlId(9);
		stock.setBlCount("789");
		stock.setBlGroup("A-ve");
		stock.setBlRBC("467mgh");
		stock.setBlWBC("231mgh");
		stock.setDonor(donor);
		
		boolean result = serv.doInsert(stock);
		assertEquals(true, result);
		
	}
	
	//@Test
	@Ignore
	void test_DeleteStock() {
		
		
		boolean result = serv.doDelete(9);
		assertEquals(true, result);
		
	}
	
	@Test
	//@Ignore
	void test_FindAllStock() {
		
		
		List<BloodStock> result = serv.doFindAll();
		assertNotNull(result);
		
	}
	
	
	
//	@Autowired
//	BloodDonorService serv;
//	
//	//@Test
//	@Ignore
//	public void test_InsertDonor() {
//		BloodDonor donor = new BloodDonor();
//		donor.setDnrName("vijay");
//		donor.setDnrAge("56");
//		donor.setDnrMob("963789451");
//		donor.setDnrWeight("75kg");
//		donor.setDnrLocation("chennai");
//		
//		boolean result = serv.doInsert(donor);
//		assertEquals(true, result);
//	}
//	
//	//@Test
//	@Ignore
//	public void test_UpdateDonor() {
//		BloodDonor donor = new BloodDonor();
//		donor.setDnrId(10);
//		donor.setDnrName("vijay");
//		donor.setDnrAge("45");
//		donor.setDnrMob("9787531956");
//		donor.setDnrWeight("50kg");
//		donor.setDnrLocation("Bangalore");
//		
//		boolean result = serv.doInsert(donor);
//		assertEquals(true, result);
//	}
//	
//	//@Test
//	@Ignore
//	public void test_DeleteDonor() {
//		boolean result = serv.doDelete(6);
//		assertEquals(true, result);
//	}
//	
//	@Test
//	//@Ignore
//	public void test_FindAllDonor() {
//		List<BloodDonor> result = serv.doFindAll();
//		assertNotNull(result);
//	}

}
