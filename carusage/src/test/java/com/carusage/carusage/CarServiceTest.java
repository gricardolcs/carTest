package com.carusage.carusage;


import com.carusage.carusage.dto.CarDTO;
import com.carusage.carusage.enums.CarMode;
import com.carusage.carusage.factory.CarFactory;
import com.carusage.carusage.model.Car;
import com.carusage.carusage.model.Friday;
import com.carusage.carusage.model.Monday;
import com.carusage.carusage.model.Tuesday;
import com.carusage.carusage.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

	@InjectMocks
	private CarService carService;

	@Mock
	private CarFactory carFactory;

	@Test
	void getMondayCar() {
		Car car = new Monday();
		when(carFactory.createCarByMode(ArgumentMatchers.any(CarMode.class))).thenReturn(car);

		CarDTO carDTO = new CarDTO();
		carDTO.setCarUsage("Monday");
		carDTO.setIsCamouflage(false);
		carDTO.setIsArmed(false);

		String message = carService.getCarByUsage(carDTO);
		assertEquals("Street usage Car has produced.", message);
	}

	@Test
	void getTuesdayCar() {
		Car car = new Tuesday();
		when(carFactory.createCarByMode(ArgumentMatchers.any(CarMode.class))).thenReturn(car);
		CarDTO carDTO = new CarDTO();
		carDTO.setCarUsage("Tuesday");
		String message = carService.getCarByUsage(carDTO);
		assertEquals("Sport racing usage Car has produced.", message);
	}

	@Test
	void getFridayCar() {
		Car car = new Friday();
		when(carFactory.createCarByMode(ArgumentMatchers.any(CarMode.class))).thenReturn(car);

		CarDTO carDTO = new CarDTO();
		carDTO.setCarUsage("Friday");
		carDTO.setIsArmed(true);
		carDTO.setIsCamouflage(true);

		String message = carService.getCarByUsage(carDTO);
		assertEquals("Secret agent usage Car has produced.", message);
	}

	@Test
	void getCarNone() {
		Car car = new Friday();

		CarDTO carDTO = new CarDTO();
		carDTO.setCarUsage("Friday");
		carDTO.setIsArmed(false);
		carDTO.setIsCamouflage(false);

		String message = carService.getCarByUsage(carDTO);
		assertEquals("Car can not created. Car type is invalid!", message);

	}

}