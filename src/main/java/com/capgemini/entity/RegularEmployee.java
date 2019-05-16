package com.capgemini.entity;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee {
	private double salary;
	private int bonus;
	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RegularEmployee(int empId, String empName,double salary, int bonus) {
		super(empId,empName);
		this.salary = salary;
		this.bonus = bonus;
	}



	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}
