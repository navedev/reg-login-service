package com.wipro.reglogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.reglogin.domain.Role;
import com.wipro.reglogin.model.RoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByRole(RoleEnum role);

}
