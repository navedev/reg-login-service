package com.wipro.reglogin.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor()
public class JwtResponse {

	private String token;

	private String type = "Bearer";

	private Integer id;

	private String username;

	private String email;

	private List<String> roles;

	public JwtResponse(String token, Integer id, String username, String email, List<String> roles) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

}
