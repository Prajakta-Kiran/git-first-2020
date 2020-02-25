package com.example.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyBoardController {
	static Map<String, String> teamDetails = new HashMap<String, String>();
	static{	
		teamDetails.put("Prajakta", "Order");
		teamDetails.put("Aardhya", "Order");
		teamDetails.put("Tushar", "Delivery");		
	}
	
	
	@RequestMapping("/getDetails")
	public Map<String, String> getTeamDetails() {		
		return teamDetails;
		
	}

}
