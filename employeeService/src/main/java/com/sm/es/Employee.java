package com.sm.es;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Employee {
	private int id;
	private String name;
	private LocalDateTime dob;
	private Float salary;
	private String address;
	private String designation;

	public Employee() {
		super();
	}


public Employee(int id, String name, LocalDateTime dob, Float salary, String address, String designation ) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.salary = salary;
	this.address = address;
	this.designation = designation;
	
}
@Id
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDateTime getDob() {
	return dob;
}

public void setDob(LocalDateTime dob) {
	this.dob = dob;
}

public Float getSalary() {
	return salary;
}

public void setSalary(Float salary) {
	this.salary = salary;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
			+ ", designation=" + designation + ", getId()=" + getId() + ", getName()=" + getName() + ", getDob()="
			+ getDob() + ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress() + ", getDesignation()="
			+ getDesignation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}






}
