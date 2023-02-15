package com.brunojudson.curso.ws.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brunojudson.curso.ws.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	Optional<User> findByEmail(String email);

}
