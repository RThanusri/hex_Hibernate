package com.hex.hibernate1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Availability {
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	@GeneratedValue
	@Id
	int bno;
	
	String Available;
	int Quantity;
	public String getAvailable() {
		return Available;
	}
	public void setAvailable(String available) {
		Available = available;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	Availability()
	{
		
	}
	public Availability(String available, int quantity) {
		super();
		Available = available;
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Availability [Available=" + Available + ", Quantity=" + Quantity + "]";
	}
	
	

}
