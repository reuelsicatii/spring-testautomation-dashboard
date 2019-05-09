package com.nimphus.reportdashboard.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TestSuite {
	
	//Properties or Columns
	//=============================================================
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "testSuite")
    private Set<TestScenario> testScenario;
	
	//Constructor
	//=============================================================
	public TestSuite(String name) {
		this.name = name;
	}
	
	public TestSuite(String name, Set<TestScenario> testScenario) {
		this.name = name;
		this.testScenario = testScenario;
	}

	//Getters & Setters
	//=============================================================
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<TestScenario> getTestScenario() {
		return testScenario;
	}

	public void setTestScenario(Set<TestScenario> testScenario) {
		this.testScenario = testScenario;
	}

	@Override
	public String toString() {
		return "TestSuite [id=" + id + ", name=" + name + ", testScenario=" + testScenario + "]";
	}
	
	

}
