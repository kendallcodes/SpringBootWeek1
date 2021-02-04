package com.yogafinder.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.yogafinder.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
}
