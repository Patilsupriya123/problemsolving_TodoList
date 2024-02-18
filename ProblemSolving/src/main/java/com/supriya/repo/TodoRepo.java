package com.supriya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supriya.entity.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {

}
