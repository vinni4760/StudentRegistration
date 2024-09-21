package com.nt.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Laptop {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private Integer id;
	@NonNull
	 private String model;
	@NonNull
	 private String version;
	@NonNull
	 private Double price;
}
