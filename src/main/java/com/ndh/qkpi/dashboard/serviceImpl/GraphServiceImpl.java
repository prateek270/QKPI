package com.ndh.qkpi.dashboard.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ndh.qkpi.dashboard.entity.Filter;
import com.ndh.qkpi.dashboard.model.Data;
import com.ndh.qkpi.dashboard.model.Graph;
import com.ndh.qkpi.dashboard.model.IndexScreen;
import com.ndh.qkpi.dashboard.model.test;
import com.ndh.qkpi.dashboard.repository.CSIRepository;
import com.ndh.qkpi.dashboard.repository.DummyGraphRepository;
import com.ndh.qkpi.dashboard.repository.FilterRepository;
import com.ndh.qkpi.dashboard.repository.SSIRepository;
import com.ndh.qkpi.dashboard.service.GraphService;

@Service
public class GraphServiceImpl implements GraphService {
	
	
	@Autowired
	private DummyGraphRepository dummyGraphRepository;
	@Autowired
	private FilterRepository filterRepository;
	@Autowired
	private CSIRepository csiRepository;
	@Autowired
	private SSIRepository ssiRepository;
	
	public HashMap<String, Object> getGraphDetailsService(String kpiValue) {
		
//		RestTemplate restTemplate = new RestTemplate();
//		String resourceUrl
//		  = "http://localhost:8081/testApi";
//		ResponseEntity<test> response
//		  = restTemplate.getForEntity(resourceUrl,test.class);
//		ArrayList<Graph> graph=new ArrayList<Graph>();
//		ArrayList<Double> aValue=new ArrayList<Double>();
//		aValue=response.getBody().getActual();
//		ArrayList<Double> bValue=new ArrayList<Double>();
//		bValue=response.getBody().getBudgeted();
//
//		ArrayList<String> dataFrequency=new ArrayList<String>();
//		dataFrequency=response.getBody().getXaxis();
//		
//		Graph actualValue=new Graph();
//		actualValue.setType("column");
//		actualValue.setName("Act");
//		actualValue.setColor("#9EEDB6");
//		actualValue.setData(aValue);
//
//		Graph budgetedValue=new Graph();
//		budgetedValue.setType("column");
//		budgetedValue.setName("Bud");
//		budgetedValue.setColor("#D6D6D6 ");
//		budgetedValue.setData(bValue);
//		
//		graph.add(actualValue);
//		graph.add(budgetedValue);
//		Data data=new Data(graph);
//		ArrayList<Filter> filter=new ArrayList<Filter>();
//		for(int i=0;i<filterRepository.findByKpiName(kpiValue).size();i++)
//		{
//			Filter fil=new Filter(kpiValue,filterRepository.findByKpiName(kpiValue).get(i).getTitle(),filterRepository.findByKpiName(kpiValue).get(i).getType(),filterRepository.findByKpiName(kpiValue).get(i).getValues());
//			
//			filter.add(fil);
//		}
//		//GraphDetails graphDetails = new GraphDetails(data,dataFrequency,filter);
//		HashMap<String, Object> hashMap=new HashMap<String, Object>();
//		hashMap.put("data",data);
//		hashMap.put("xAxis",dataFrequency);
//		hashMap.put("filters", filter);
//		System.out.println("result"+hashMap);
//
//		return hashMap;
		HashMap<String, Object> hashMap=new HashMap<String, Object>();
		if(kpiValue.equals("CSI"))
		{
			ArrayList<IndexScreen> data=new ArrayList<IndexScreen>();
			for(int i=0;i<csiRepository.count();i++)
			{
				IndexScreen indexScreen=new IndexScreen();
				indexScreen.setCountry(csiRepository.findAll().get(i).getCountryName());
				indexScreen.setRank(csiRepository.findAll().get(i).getRanks());

				if(csiRepository.findAll().get(i).getRanks()>3)
				{
					indexScreen.setColor("RED");

				}
				else
				{
					indexScreen.setColor("Green");

				}
				data.add(indexScreen);
	
			}
			ArrayList<Filter> filter=new ArrayList<Filter>();
			for(int i=0;i<filterRepository.findByKpiName(kpiValue).size();i++)
			{
				Filter fil=new Filter(kpiValue,filterRepository.findByKpiName(kpiValue).get(i).getTitle(),filterRepository.findByKpiName(kpiValue).get(i).getType(),filterRepository.findByKpiName(kpiValue).get(i).getValues());
				
				filter.add(fil);
			}
			hashMap.put("data",data);
			hashMap.put("filters", filter);
		}
		else if(kpiValue.equals("SSI"))
		{
			ArrayList<IndexScreen> data=new ArrayList<IndexScreen>();
			for(int i=0;i<ssiRepository.count();i++)
			{
				IndexScreen indexScreen=new IndexScreen();
				indexScreen.setCountry(ssiRepository.findAll().get(i).getCountryName());
				indexScreen.setRank(ssiRepository.findAll().get(i).getRanks());

				if(ssiRepository.findAll().get(i).getRanks()>3)
				{
					indexScreen.setColor("RED");

				}
				else
				{
					indexScreen.setColor("Green");

				}
				data.add(indexScreen);
	
			}
			ArrayList<Filter> filter=new ArrayList<Filter>();
			for(int i=0;i<filterRepository.findByKpiName(kpiValue).size();i++)
			{
				Filter fil=new Filter(kpiValue,filterRepository.findByKpiName(kpiValue).get(i).getTitle(),filterRepository.findByKpiName(kpiValue).get(i).getType(),filterRepository.findByKpiName(kpiValue).get(i).getValues());
				
				filter.add(fil);
			}
			hashMap.put("data",data);
			hashMap.put("filters", filter);

		}
		else
		{
			ArrayList<Graph> graph=new ArrayList<Graph>();
			ArrayList<Double> aValue=new ArrayList<Double>();
			ArrayList<Double> bValue=new ArrayList<Double>();
	
			ArrayList<String> dataFrequency=new ArrayList<String>();
			
			Graph actualValue=new Graph();
			actualValue.setType("column");
			actualValue.setName("Act");
			actualValue.setColor("#9EEDB6");
			Graph budgetedValue=new Graph();
			budgetedValue.setType("column");
			budgetedValue.setName("Bud");
			budgetedValue.setColor("#D6D6D6 ");
			for(int i=0;i<dummyGraphRepository.count();i++)
			{
				aValue.add((double) dummyGraphRepository.findAllByOrderByIdAsc().get(i).getActualValue());
				bValue.add((double) dummyGraphRepository.findAllByOrderByIdAsc().get(i).getBudgetedValue());
				dataFrequency.add(dummyGraphRepository.findAllByOrderByIdAsc().get(i).getxAxis());
	
			}
			actualValue.setData(aValue);
			budgetedValue.setData(bValue);
			graph.add(actualValue);
			graph.add(budgetedValue);
			Data data=new Data(graph);
			ArrayList<Filter> filter=new ArrayList<Filter>();
			for(int i=0;i<filterRepository.findByKpiName(kpiValue).size();i++)
			{
				Filter fil=new Filter(kpiValue,filterRepository.findByKpiName(kpiValue).get(i).getTitle(),filterRepository.findByKpiName(kpiValue).get(i).getType(),filterRepository.findByKpiName(kpiValue).get(i).getValues());
				
				filter.add(fil);
			}
			//GraphDetails graphDetails = new GraphDetails(data,dataFrequency,filter);
			hashMap.put("data",data);
			hashMap.put("xAxis",dataFrequency);
			hashMap.put("filters", filter);
	
			
		}
		return hashMap;
	}
	
	

}
