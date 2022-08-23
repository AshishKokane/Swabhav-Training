package com.aurionpro.test;

import com.aurionpro.model.IEatable;
import com.aurionpro.model.IWorkable;

import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		atTheWorkStation(manager);
		atTheCanteen(manager);
		System.out.println("__________________________");
		atTheWorkStation(robot);
	

	}

	private static void atTheCanteen(IEatable worker) {
		worker.startEat();
		worker.stopEat();
		
	}

	private static void atTheWorkStation(IWorkable worker) {
		worker.startWork();
		worker.stopWork();
		
	}

}
