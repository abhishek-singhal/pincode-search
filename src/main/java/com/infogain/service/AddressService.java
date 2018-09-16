/**
 * 
 */
package com.infogain.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.dao.AddressDao;
import com.infogain.entity.Address;

/**
 * @author Abhishek1.Singhal
 *
 */

@Service
public class AddressService {
	
	private AddressDao addressDao;

	@Autowired
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}
	
	@Transactional
	public Address findByPincode(Integer pincode) {
		Optional<Address> address= addressDao.findById(pincode);
		if(address.isPresent()) {
			return address.get();
		}else {
			return null;
		}
	}
	
	public List<Address> findByState(String state) {
		return addressDao.findByStateContainingIgnoreCase(state);
	}
}
