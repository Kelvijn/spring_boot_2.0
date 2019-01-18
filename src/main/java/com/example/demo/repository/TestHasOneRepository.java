package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.harvest.api.time.TestHasOne;

public interface TestHasOneRepository extends CrudRepository<TestHasOne, Long> {

}
