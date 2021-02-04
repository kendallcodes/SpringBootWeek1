package com.yogafinder.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.yogafinder.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
