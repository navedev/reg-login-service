package com.wipro.reglogin.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.reglogin.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
