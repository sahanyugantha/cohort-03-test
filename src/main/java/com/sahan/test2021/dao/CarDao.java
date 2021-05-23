package com.sahan.test2021.dao;

import java.util.ArrayList;
import java.util.List;

import com.sahan.test2021.model.Car;

public class CarDao {
	
	private static CarDao newInstance;
	
	private CarDao() {
		
	}
	
	public static CarDao getInstance() {
		if (newInstance==null) {
			newInstance = new CarDao();
		}
		return newInstance;
	}
	
	private List<Car> carList = new ArrayList<>();
	
	public List<Car> getAll() {
		carList.add(new Car(1, "CH-R", "Toyota"));
		carList.add(new Car(2, "A6", "Audi"));
		carList.add(new Car(3, "Axio", "Toyota"));
		return carList;
	}

}
