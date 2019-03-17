package com.ndh.qkpi.dashboard.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ndh.qkpi.dashboard.entity.Filter;
import com.ndh.qkpi.dashboard.repository.FilterRepository;
import com.ndh.qkpi.dashboard.service.GraphService;

@RestController
@CrossOrigin
public class GraphController {
	
	@Autowired
	private GraphService graphService;
	@Autowired
	private FilterRepository filterRepository;
	@GetMapping	
	public @ResponseBody HashMap<String, Object> getGraphDetails(@RequestParam("kpi") String kpiValue){
		
		HashMap<String, Object> graphDetails = graphService.getGraphDetailsService(kpiValue);
	    return graphDetails;
	}
	
	@RequestMapping(value="/filters",method = RequestMethod.POST)
	public void saveMIS36(@RequestBody Filter filter)
	{
		filterRepository.save(filter);
	}
}
