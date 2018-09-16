/**
 * Copyright © 2018 abc corp
 */
package com.infogain.utility;

import java.util.HashMap;
import java.util.List;
import org.aspectj.lang.annotation.Aspect;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.infogain.entity.Address;

/**
 * @author Abhishek1.Singhal
 *
 * This class is
 */

@Service
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
@Aspect
public class AddressUtility {
	
	/**
	 * 
	 * @author Abhishek1.Singhal
	 * @param address
	 * @return JSONObject
	 */
	public JSONObject validateAddress(Address address) {
		
		HashMap<String, Object> responseMap = new HashMap<>();
		
		if(address != null) {
			responseMap.put("isErr", false);
			responseMap.put("errDesc", "");
			responseMap.put("address", address);
		}else {
			responseMap.put("isErr", true);
			responseMap.put("errDesc", "Pincode Not Found");
		}
		return new JSONObject(responseMap);
	}
	
	public JSONObject validateAddresses(List<Address> addressList) {
		HashMap<String, Object> responseMap = new HashMap<>();
		if(addressList.isEmpty()) {
			responseMap.put("isErr", true);
			responseMap.put("errDesc", "No information related to search query!");
		}else {
			responseMap.put("isErr", false);
			responseMap.put("errDesc", "");
			responseMap.put("address", addressList);
		}
		return new JSONObject(responseMap);
	}
}
