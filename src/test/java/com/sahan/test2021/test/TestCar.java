package com.sahan.test2021.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sahan.test2021.dao.CarDao;
import com.sahan.test2021.model.Car;

public class TestCar {

	List<Car> list = CarDao.getInstance().getAll(); 
	
	@Test
	public void testCarDao() {
		int actual = list.size();
		assertEquals(4, actual);
		
	}
	
}
