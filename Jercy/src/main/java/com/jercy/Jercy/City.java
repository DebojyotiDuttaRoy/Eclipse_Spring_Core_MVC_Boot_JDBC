package com.jercy.Jercy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
	private int cityId;
	private String cityName;
	
	public City() {System.out.println("Calling Constructor !!!");}
	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
