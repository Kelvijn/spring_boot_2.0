package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.harvest.api.time.TestHasOne;
import com.example.demo.harvest.api.time.TestOther;

public interface TestHasOneRepository extends CrudRepository<TestHasOne, Long> {

	List<TestHasOne> findByTestOther(TestOther testOther);

}
