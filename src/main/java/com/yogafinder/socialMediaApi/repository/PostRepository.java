package com.yogafinder.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.yogafinder.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
