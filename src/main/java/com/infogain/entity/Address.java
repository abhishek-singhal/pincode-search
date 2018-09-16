/**
 * 
 */
package com.infogain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abhishek1.Singhal
 *
 */

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="pincode")
	private Integer pincode;
	
	@Column(name="officename")
	private String office;
	
	@Column(name="taluk")
	private String taluk;
	
	@Column(name="districtname")
	private String district;
	
	@Column(name="statename")
	private String state;

	public Address() {

	}

	public Address(Integer pincode, String office, String taluk, String district, String state) {
		this.pincode = pincode;
		this.office = office;
		this.taluk = taluk;
		this.district = district;
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
