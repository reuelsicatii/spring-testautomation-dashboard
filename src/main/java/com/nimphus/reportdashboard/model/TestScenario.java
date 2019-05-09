package com.nimphus.reportdashboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class TestScenario {
	
	//Properties or Columns
	//=============================================================
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	private String description;	
	
    @ManyToOne
    private TestSuite testSuite;
    
	//Constructor
	//=============================================================
	public TestScenario(String description) {
		this.description = description;
	}
    
	public TestScenario(String description, TestSuite testSuite) {
		this.description = description;
		this.testSuite = testSuite;
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
		return description;
	}

	public void setName(String name) {
		this.description = name;
	}

	public TestSuite getTestSuite() {
		return testSuite;
	}

	public void setTestSuite(TestSuite testSuite) {
		this.testSuite = testSuite;
	}

	@Override
	public String toString() {
		return "TestScenario [id=" + id + ", name=" + description + ", testSuite=" + testSuite + "]";
	}
    
    

}
