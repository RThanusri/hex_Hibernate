package com.hex.hibernate1;





import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")  
public class Book {
    @Id
    @GeneratedValue
    private Long bno;
    private String name;
    private double price;
    @OneToOne(cascade = CascadeType.ALL)
    
 Availability avail;
  

    public Availability getAvail() {
	return avail;
}

public void setAvail(Availability avail) {
	this.avail = avail;
}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bno=" + bno + ", name=" + name + ", price=" + price + "]";
    }
}
