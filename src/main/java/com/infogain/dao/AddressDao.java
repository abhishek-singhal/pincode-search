/**
 * 
 */
package com.infogain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogain.entity.Address;
import java.lang.String;
import java.util.List;

/**
 * @author Abhishek1.Singhal
 *
 */

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {
	public List<Address> findByStateContainingIgnoreCase(String state);
}
