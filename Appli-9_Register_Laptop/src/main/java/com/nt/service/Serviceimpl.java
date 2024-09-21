package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Laptop;
import com.nt.repository.IRepository;

@Service
public class Serviceimpl implements IService{
	@Autowired
	private IRepository repo;

	@Override
	public void registerLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		repo.save(laptop);
		
	}
	

}
