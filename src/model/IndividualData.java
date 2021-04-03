package model;

import java.util.Date;

public class IndividualData {

	private int id;
	private Date date;
	private float price;
	private float high;
	private float low;
	
	public IndividualData() {
		super();
		this.id = 0;
		this.date = new Date();
		this.price = 0.0f;
		this.high = 0.0f;
		this.low = 0.0f;
	}
	
	public IndividualData(float price, float high, float low) {
		this.price = price;
		this.high = high;
		this.low = low;
	}

	public IndividualData(int id, Date date, float price, float high, float low) {
		super();
		this.id = id;
		this.date = date;
		this.price = price;
		this.high = high;
		this.low = low;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}
	
	
	
	

}
