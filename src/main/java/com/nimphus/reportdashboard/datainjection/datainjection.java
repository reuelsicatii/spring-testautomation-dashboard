package com.nimphus.reportdashboard.datainjection;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.nimphus.reportdashboard.model.TestScenario;
import com.nimphus.reportdashboard.model.TestSuite;
import com.nimphus.reportdashboard.repositories.TestScenarioRepository;
import com.nimphus.reportdashboard.repositories.TestSuiteRepository;

@Component
public class datainjection implements ApplicationListener<ContextRefreshedEvent> {

	private TestSuiteRepository testSuiteRepository;
	private TestScenarioRepository testScenarioRepository;

	public datainjection(TestSuiteRepository testSuiteRepository, TestScenarioRepository testScenarioRepository) {
		this.testSuiteRepository = testSuiteRepository;
		this.testScenarioRepository = testScenarioRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		testscenariototestsuite();
	}

	//TestSuite --> TestScenario
	//=============================================================
	/*
	 * private void testsuitetotestscenario() {
	 * 
	 * TestScenario testScenario1 = new TestScenario(
	 * "Given I'm a existing Partner\r\n" + "When I Click Forgot Password\r\n" +
	 * "And Successfully Changed the Password\r\n" +
	 * "Then I'll see the Dashboard Page");
	 * 
	 * TestScenario testScenario2 = new TestScenario(
	 * "Given I'm a existing Partner\r\n" + "When I Click Forgot Password\r\n" +
	 * "And Successfully Changed the Password\r\n" +
	 * "Then I'll see the Dashboard Page");
	 * 
	 * Set<TestScenario> testScenarios = new HashSet<TestScenario>();
	 * testScenarios.add(testScenario1); testScenarios.add(testScenario2);
	 * 
	 * TestSuite testSuite = new TestSuite("Registration TestSuite v1.0",
	 * testScenarios); System.out.println(testSuite.toString());
	 * 
	 * testSuiteRepository.save(testSuite);
	 * System.out.println(testSuiteRepository.findAll().toString()); }
	 */
	
	
	//TestScenario --> TestSuite
	//=============================================================
	private void testscenariototestsuite() {
		
		TestSuite testSuite = new TestSuite("Registration TestSuite v1.0");
		
		TestScenario testScenario1 = new TestScenario(
				"Given I'm a existing Partner\r\n" 
				+ "When I Click Forgot Password\r\n"
				+ "And Successfully Changed the Password\r\n" 
				+ "Then I'll see the Dashboard Page",testSuite);
		
		TestScenario testScenario2 = new TestScenario(
				"Given I'm a existing Partner\r\n" 
				+ "When I Click Forgot Password\r\n"
				+ "And Successfully Changed the Password\r\n" 
				+ "Then I'll see the Dashboard Page",testSuite);

		testSuiteRepository.save(testSuite);
		testScenarioRepository.save(testScenario1);
		testScenarioRepository.save(testScenario2);

	}
}