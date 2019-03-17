package com.ndh.qkpi.dashboard.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ndh.qkpi.dashboard.entity.QCS;
import com.ndh.qkpi.dashboard.entity.SAves;
import com.ndh.qkpi.dashboard.entity.Users;
import com.ndh.qkpi.dashboard.model.Dashboard;
import com.ndh.qkpi.dashboard.model.test;
import com.ndh.qkpi.dashboard.repository.QCSRepository;
import com.ndh.qkpi.dashboard.repository.SAvesRepository;
import com.ndh.qkpi.dashboard.service.DashboardService;
import com.ndh.qkpi.dashboard.service.UserService;

@RestController
@CrossOrigin
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	@Autowired
	private UserService userService;
	@Autowired
	private QCSRepository qcsRepository;
	@Autowired
	private SAvesRepository savesRepository;
	
	
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public HashMap<String, Object> login(@RequestBody Users user)
	{
		return userService.verifyUser(user);
		
		
	}
	
	@RequestMapping(value="/hello")
	public HashMap<String, Object> testApi()
	{
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8081/testApi";
		ResponseEntity<test> response
		  = restTemplate.getForEntity(fooResourceUrl,test.class);
		System.out.println(response.getBody());
		HashMap<String , Object> hm=new HashMap<String, Object>();
		ArrayList<String> axis=new ArrayList<String>();
		axis=response.getBody().getXaxis();
		axis.add("May");
		hm.put("Xaxis", axis);
		hm.put("Actual", response.getBody().getActual());
		hm.put("Budgeted", response.getBody().getBudgeted());


		//response.getBody()
//		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		return hm;
		
		
	}
	
	
	
	@RequestMapping("/dashboard")
	public HashMap<String, Object> getDashboard()
	{
		
		Dashboard dashboard = new Dashboard();
		HashMap<String , Object> hashMap = new HashMap<String, Object>();
		List<Object> list = new ArrayList<Object>();
		
	    dashboard = dashboardService.getDashboardService();
		hashMap.put("Status", "200");
		hashMap.put("Message", "Successfull");
		for(int i=0;i<dashboard.getKpi().size();i++)	
		{
			list.add(dashboard.getKpi().get(i));
		}
		for(int i=0;i<dashboard.getRes().size();i++)	
		{
			list.add(dashboard.getRes().get(i));
		}
		for(int i=0;i<dashboard.getIndexResult().size();i++)	
		{
			list.add(dashboard.getIndexResult().get(i));
		}
		//hashMap.put("Data", data.getDashboard().getBud());

		hashMap.put("Cards", list);

		return hashMap;
		//return dashboardService.getDashboard();
	}
	
	
	
	@RequestMapping(value="/saveQCS",method = RequestMethod.POST)
	public void saveQCS(@RequestBody QCS qcs)
	{
		qcsRepository.save(qcs);
	}
	
	@RequestMapping(value="/saveDashboard",method = RequestMethod.POST)
	public HashMap<String, String> saveDashboard(@RequestBody Dashboard dashboard)
	{
		int status = dashboardService.saveDash(dashboard);
		HashMap<String, String> hashMap = new HashMap<>();
		
		if(status == 0) {
			hashMap.put("status", "200");
			hashMap.put("Message", "Post request was succesfull");
		}
		else {
			hashMap.put("status", "404");
			hashMap.put("Message", "Post request encountered an error.");
		}
		
		return hashMap;
	}
	
//	@RequestMapping(value="/saveWarrantyPayment",method = RequestMethod.POST)
//	public void saveWarrantyPayment(@RequestBody WarrantyPayment warrantyPayment)
//	{
//		warrantyPaymentRepository.save(warrantyPayment);
//	}
//	
//	@RequestMapping(value="/saveMIS12",method = RequestMethod.POST)
//	public void saveMIS12(@RequestBody MIS12 mis12)
//	{
//		mis12Repository.save(mis12);
//	}
//	
//	@RequestMapping(value="/saveMIS36",method = RequestMethod.POST)
//	public void saveMIS36(@RequestBody MIS36 mis36)
//	{
//		mis36Repository.save(mis36);
//	}
//	
//	@RequestMapping(value="/saveMIS3",method = RequestMethod.POST)
//	public void saveMIS3(@RequestBody MIS3 mis3)
//	{
//		mis3Repository.save(mis3);
//	}
	
	@RequestMapping(value="/storeSAves",method = RequestMethod.POST)
	public void storeSAves(@RequestBody SAves saves)
	{
		savesRepository.save(saves);
	}
	
	
	
}
