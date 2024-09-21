package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Laptop;

public interface IRepository extends JpaRepository<Laptop, Integer>{

}
