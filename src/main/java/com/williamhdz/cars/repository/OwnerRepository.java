package com.williamhdz.cars.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.williamhdz.cars.domain.Owner;

@Component
public interface OwnerRepository extends JpaRepository<Owner, Long> {
	
	Optional<Owner> findByFirstname(String firstName);
	
}
