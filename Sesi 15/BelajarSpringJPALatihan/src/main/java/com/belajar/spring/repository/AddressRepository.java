package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
