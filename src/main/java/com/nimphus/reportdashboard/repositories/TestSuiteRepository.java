package com.nimphus.reportdashboard.repositories;

import org.springframework.data.repository.CrudRepository;
import com.nimphus.reportdashboard.model.TestSuite;

public interface TestSuiteRepository extends CrudRepository<TestSuite, Long> {
}