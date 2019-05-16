package com.capgemini.entity;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {
	private float pay_per_hour;
	private int contract_duration;
	
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String empName,float pay_per_hour, int contract_duration) {
		super(empId,empName);
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public int getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}
	
	
}
