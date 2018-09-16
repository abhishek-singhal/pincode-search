/**
 * 
 */
package com.infogain.controller;


import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.entity.Address;
import com.infogain.service.AddressService;
import com.infogain.utility.AddressUtility;


/**
 * @author Abhishek1.Singhal
 * 
 */

@RestController
@RequestMapping(path="/api")
public class AddressController implements AddressConstantsIfc{

	@Autowired
	private AddressUtility addressUtility;
	
	@Autowired
	private AddressService addressService;
	
	/**
	 * @author Abhishek1.Singhal
	 * @param pincode
	 * @return Response
	 */
	@GetMapping(path="/pincode/{pincode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> getAddressByPincode(@PathVariable("pincode") Integer pincode) {
		Address address = addressService.findByPincode(pincode);
		return new ResponseEntity<JSONObject>(addressUtility.validateAddress(address), HttpStatus.OK);
	}

	/**
	 * @author Abhishek1.Singhal
	 * @param state
	 * @return Response
	 */
	@GetMapping(path="/state/{state}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> getAddressByState(@PathVariable("state") String state) {
		List<Address> addressList = addressService.findByState(state);
		return new ResponseEntity<JSONObject>(addressUtility.validateAddresses(addressList), HttpStatus.OK);
	}
}
