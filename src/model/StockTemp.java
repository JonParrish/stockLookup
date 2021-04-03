package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class StockTemp {
	private String dayOne;
	private String dayTwo;
	private String dayThree;
	private String dayFour;
	private String dayFive;
	private String daySix;
	private String daySeven;
	private float priceOne;
	private float priceTwo;
	private float priceThree;
	private float priceFour;
	private float priceFive;
	private float priceSix;
	private float priceSeven;
	
	public StockTemp() {
		this.dayOne = "99/99/9999";
		this.dayTwo = "99/99/9999";
		this.dayThree = "99/99/9999";
		this.dayFour = "99/99/9999";
		this.dayFive = "99/99/9999";
		this.daySix = "99/99/9999";
		this.daySeven = "99/99/9999";
		this.priceOne = 99.f;
		this.priceTwo = 99.f;
		this.priceThree = 99.f;
		this.priceFour = 99.f;
		this.priceFive = 99.f;
		this.priceSix = 99.f;
		this.priceSeven = 99.f;
		
	}

	public String getDayOne() {
		return dayOne;
	}

	public void setDayOne(String dayOne) {
		this.dayOne = dayOne;
	}

	public String getDayTwo() {
		return dayTwo;
	}

	public void setDayTwo(String dayTwo) {
		this.dayTwo = dayTwo;
	}

	public String getDayThree() {
		return dayThree;
	}

	public void setDayThree(String dayThree) {
		this.dayThree = dayThree;
	}

	public String getDayFour() {
		return dayFour;
	}

	public void setDayFour(String dayFour) {
		this.dayFour = dayFour;
	}

	public String getDayFive() {
		return dayFive;
	}

	public void setDayFive(String dayFive) {
		this.dayFive = dayFive;
	}

	public String getDaySix() {
		return daySix;
	}

	public void setDaySix(String daySix) {
		this.daySix = daySix;
	}

	public String getDaySeven() {
		return daySeven;
	}

	public void setDaySeven(String daySeven) {
		this.daySeven = daySeven;
	}

	public float getPriceOne() {
		return priceOne;
	}

	public void setPriceOne(float priceOne) {
		this.priceOne = priceOne;
	}

	public float getPriceTwo() {
		return priceTwo;
	}

	public void setPriceTwo(float priceTwo) {
		this.priceTwo = priceTwo;
	}

	public float getPriceThree() {
		return priceThree;
	}

	public void setPriceThree(float priceThree) {
		this.priceThree = priceThree;
	}

	public float getPriceFour() {
		return priceFour;
	}

	public void setPriceFour(float priceFour) {
		this.priceFour = priceFour;
	}

	public float getPriceFive() {
		return priceFive;
	}

	public void setPriceFive(float priceFive) {
		this.priceFive = priceFive;
	}

	public float getPriceSix() {
		return priceSix;
	}

	public void setPriceSix(float priceSix) {
		this.priceSix = priceSix;
	}

	public float getPriceSeven() {
		return priceSeven;
	}

	public void setPriceSeven(float priceSeven) {
		this.priceSeven = priceSeven;
	}
	
	
}
