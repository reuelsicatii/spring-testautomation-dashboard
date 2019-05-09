package com.nimphus.reportdashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nimphus.reportdashboard.repositories.TestScenarioRepository;
import com.nimphus.reportdashboard.repositories.TestSuiteRepository;

@Controller
public class DisplayController {

	private TestSuiteRepository testSuiteRepository;
	//private TestScenarioRepository testScenarioRepository;

	@Autowired
	public DisplayController(TestSuiteRepository testSuiteRepository, TestScenarioRepository testScenarioRepository) {
		this.testSuiteRepository = testSuiteRepository;
		//this.testScenarioRepository = testScenarioRepository;
	}

	@RequestMapping("/display")
	public String getDisplay(Model model) {

		model.addAttribute("display", testSuiteRepository.findAll());
		//model.addAttribute("testScenario", testScenarioRepository.findAll());

		return "display";
	}

}
