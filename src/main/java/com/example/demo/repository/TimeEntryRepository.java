package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.harvest.api.time.TestHasOne;;

public interface TimeEntryRepository extends CrudRepository<TestHasOne, Long> {

}
