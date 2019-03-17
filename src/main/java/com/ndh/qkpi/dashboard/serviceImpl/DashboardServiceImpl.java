package com.ndh.qkpi.dashboard.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndh.qkpi.dashboard.entity.WarrantyPayment;
import com.ndh.qkpi.dashboard.entity.MIS3;
import com.ndh.qkpi.dashboard.entity.MIS36;
import com.ndh.qkpi.dashboard.entity.QCS;
import com.ndh.qkpi.dashboard.entity.SAves;
import com.ndh.qkpi.dashboard.entity.SSI;
import com.ndh.qkpi.dashboard.entity.CSI;
import com.ndh.qkpi.dashboard.entity.MIS12;
import com.ndh.qkpi.dashboard.model.Budgeted;
import com.ndh.qkpi.dashboard.model.Dashboard;
import com.ndh.qkpi.dashboard.model.Index;
import com.ndh.qkpi.dashboard.model.IndexResult;
import com.ndh.qkpi.dashboard.model.Keys;
import com.ndh.qkpi.dashboard.model.Result;
import com.ndh.qkpi.dashboard.model.Scores;
import com.ndh.qkpi.dashboard.repository.CSIRepository;
import com.ndh.qkpi.dashboard.repository.MIS12Repository;
import com.ndh.qkpi.dashboard.repository.MIS36Repository;
import com.ndh.qkpi.dashboard.repository.MIS3Repository;
import com.ndh.qkpi.dashboard.repository.QCSRepository;
import com.ndh.qkpi.dashboard.repository.SAvesRepository;
import com.ndh.qkpi.dashboard.repository.SSIRepository;
import com.ndh.qkpi.dashboard.repository.WarrantyPaymentRepository;
import com.ndh.qkpi.dashboard.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService{
	
	@Autowired
	private WarrantyPaymentRepository warrantyPaymentRepository;
	@Autowired
	private QCSRepository qcsRepository;
	@Autowired
	private MIS3Repository mis3Repository;
	@Autowired
	private MIS12Repository mis12Repository;
	@Autowired
	private MIS36Repository mis36Repository;
	@Autowired
	private SAvesRepository savesRepository;
	@Autowired
	private CSIRepository csiRepository;
	@Autowired
	private SSIRepository ssiRepository;
	
	
	public int saveDash(Dashboard dashboard) {


		for(Budgeted b: dashboard.getKpi()) {
			switch(b.getTitle()){
				case "Warranty Payment": 
					WarrantyPayment warrantyPayment = new WarrantyPayment("KPI",b.getActualValue(), b.getBudgetedValue(), b.getTitle(), b.getColor(),b.getCurrency(),b.getBudgetedValue()-b.getActualValue());
					warrantyPaymentRepository.save(warrantyPayment);
					break;
				
				case "12MIS": 
					MIS12 mis12	= new MIS12("KPI",b.getActualValue(), b.getBudgetedValue(), b.getTitle(), b.getColor(),b.getCurrency(),b.getBudgetedValue()-b.getActualValue());
					mis12Repository.save(mis12);
					break;
				
				case "3MIS": 
					MIS3 mis3 = new MIS3("KPI",b.getActualValue(), b.getBudgetedValue(), b.getTitle(), b.getColor(),b.getCurrency(),b.getBudgetedValue()-b.getActualValue()); 	
					mis3Repository.save(mis3);
					break;
				
				case "36MIS": 
					MIS36 mis36 = new MIS36("KPI",b.getActualValue(), b.getBudgetedValue(), b.getTitle(), b.getColor(),b.getCurrency(),b.getBudgetedValue()-b.getActualValue());	
					mis36Repository.save(mis36);
					break;
			}
		}
		for(Scores s: dashboard.getScore()) {
			switch(s.getTitle()){
				case "QCS": 
							List<QCS> QCSList = new ArrayList<QCS>();							
//							Scores s=dashboard.getScore();
							//Scores scores=new Scores(s.getTitle(),s.getCurrentMonth(),s.getPreviousMonth(),s.getCountryCode());
							for(int i=0;i<s.getCountryCode().size();i++)
							{
									QCSList.add(new QCS(s.getCurrentMonth().get(i),s.getPreviousMonth().get(i),s.getCountryCode().get(i)));
							}
							
							qcsRepository.saveAll(QCSList);
					break;
					
				case "S-Aves": 
					List<SAves> SavesList = new ArrayList<SAves>();							
//					Scores s=dashboard.getScore();
					//Scores scores=new Scores(s.getTitle(),s.getCurrentMonth(),s.getPreviousMonth(),s.getCountryCode());
					for(int i=0;i<s.getCountryCode().size();i++)
					{
						SavesList.add(new SAves(s.getCurrentMonth().get(i),s.getPreviousMonth().get(i),s.getCountryCode().get(i)));
					}
					savesRepository.saveAll(SavesList);
				
				
			}
		}	
		for(Index x:dashboard.getIndex()) {
			switch (x.getTitle()) {
			case "CSI":
						List<CSI> csi=new ArrayList<CSI>();
						for(int i=0;i<x.getCountryName().size();i++)
						{
							csi.add(new CSI(x.getCountryName().get(i), x.getRanks().get(i)));
						}
						csiRepository.saveAll(csi);
				break;

			case "SSI":
						List<SSI> ssiList=new ArrayList<SSI>();
						for(int i=0;i<x.getCountryName().size();i++)
						{
							ssiList.add(new SSI(x.getCountryName().get(i), x.getRanks().get(i)));
						}
						ssiRepository.saveAll(ssiList);
				break;
			}
			
		}
		return 0;
		
	}


	public Dashboard getDashboardService() {
		// TODO Auto-generated method stub
		Budgeted budgeted = null;
		ArrayList<Budgeted> budgeteds = new ArrayList<Budgeted>();
		Dashboard dashboard =  new Dashboard();
		WarrantyPayment warrantyPayment = ((List<WarrantyPayment>) warrantyPaymentRepository.findAll()).get(0);
		
		budgeted = new Budgeted(warrantyPayment.getType(),warrantyPayment.getActualValue(), warrantyPayment.getBudgetedValue(), warrantyPayment.getTitle(),
				warrantyPayment.getColor(),warrantyPayment.getCurrency(),warrantyPayment.getDifference());
		
		budgeteds.add(budgeted);
		
		MIS12 mis12 = ((List<MIS12>) mis12Repository.findAll()).get(0);
		
		budgeted = new Budgeted(mis12.getType(),mis12.getActualValue(), mis12.getBudgetedValue(), mis12.getTitle(),
				mis12.getColor(),mis12.getCurrency(),mis12.getDifference());
		
		budgeteds.add(budgeted);
		
		MIS3 mis3 = ((List<MIS3>) mis3Repository.findAll()).get(0);
		
		budgeted = new Budgeted(mis3.getType(),mis3.getActualValue(), mis3.getBudgetedValue(), mis3.getTitle(),
				mis3.getColor(),mis3.getCurrency(),mis3.getDifference());
		
		budgeteds.add(budgeted);
		
		MIS36 mis36 = ((List<MIS36>) mis36Repository.findAll()).get(0);
		
		budgeted = new Budgeted(mis36.getType(),mis36.getActualValue(), mis36.getBudgetedValue(), mis36.getTitle(),
				mis36.getColor(),mis36.getCurrency(),mis36.getDifference());
		
		budgeteds.add(budgeted);
		
		dashboard.setKpi(budgeteds);
		
		ArrayList<String> good = new ArrayList<String>();
		ArrayList<String> bad = new ArrayList<String>();
		ArrayList<String> average = new ArrayList<String>();


		for(int i=0;i<qcsRepository.count();i++)
		{
			double currentMonth=qcsRepository.findAll().get(i).getCurrentMonth();
			double prevMonth=qcsRepository.findAll().get(i).getPreviousMonth();
			String countryCode=qcsRepository.findAll().get(i).getCountryCode();
			
			double c=currentMonth*100/prevMonth;
			c=100-c;
			
			
			if(c>5)
			{
				good.add(countryCode);
			}
			else if(c<0)
			{
				bad.add(countryCode);
			}
			else
			{
				average.add(countryCode);
			}
		}
		
		ArrayList<String> good1 = new ArrayList<String>();
		ArrayList<String> bad1 = new ArrayList<String>();
		ArrayList<String> average1 = new ArrayList<String>();
		
		for(int i=0;i<savesRepository.count();i++)
		{
			double currentMonth=savesRepository.findAll().get(i).getCurrentMonth();
			double prevMonth=savesRepository.findAll().get(i).getPreviousMonth();
			String countryCode=savesRepository.findAll().get(i).getCountryCode();
			
			double c=currentMonth*100/prevMonth;
			c=100-c;
			
			if(c>5)
			{
				good1.add(countryCode);
			}
			else if(c<0)
			{
				bad1.add(countryCode);
			}
			else
			{
				average1.add(countryCode);
			}
		}
		
		ArrayList<Keys> kQCS=new ArrayList<Keys>();
		kQCS.add(new Keys("Improved",good));
		kQCS.add(new Keys("Deteriorated <5%",average));
		kQCS.add(new Keys("Deteriorated >5%",bad));
		
		ArrayList<Keys> kSAves=new ArrayList<Keys>();
		kSAves.add(new Keys("Acheived",good));
		kSAves.add(new Keys("Not Achieved",average));
		kSAves.add(new Keys("No Production",bad));
		
		ArrayList<Result> res=new ArrayList<Result>();
		Result re=new Result("SCORE","QCS",kQCS);
		Result ree=new Result("SCORE","S-AVes",kSAves);

		
		res.add(re);
		res.add(ree);
		
//		ArrayList<String> workingGood = new ArrayList<String>();
//		ArrayList<String> workingBad = new ArrayList<String>();
		int csiRankGood=0,csiRankBad=0;
		int ssiRankGood=0,ssiRankBad=0;
		for(int i=0;i<csiRepository.count();i++)
		{
			int rank=csiRepository.findAll().get(i).getRanks();
			//String country=csiRepository.findAll().get(i).getCountryName();
			if(rank<=3)
			{
				csiRankGood++;
//				workingGood.add(country);
			}
			else
			{
				csiRankBad++;
//				workingBad.add(country);
			}
			
		}
//		ArrayList<String> workingGoodSSI = new ArrayList<String>();
//		ArrayList<String> workingBadSSI = new ArrayList<String>();
		
		for(int i=0;i<ssiRepository.count();i++)
		{
			int rank=ssiRepository.findAll().get(i).getRanks();
			//String country=ssiRepository.findAll().get(i).getCountryName();
			if(rank<=3)
			{
				ssiRankGood++;
//				workingGoodSSI.add(country);
			}
			else
			{
				ssiRankBad++;
//				workingBadSSI.add(country);
			}
			
		}
		
		ArrayList<IndexResult> indexResult=new ArrayList<IndexResult>();
		IndexResult indexResultCSI =new IndexResult("INDEX","CSI",csiRankGood,csiRankBad);
		IndexResult indexResultSSI =new IndexResult("INDEX","SSI",ssiRankGood,ssiRankBad);
		
		indexResult.add(indexResultCSI);
		indexResult.add(indexResultSSI);

		dashboard.setRes(res);		
		dashboard.setIndexResult(indexResult);
		return dashboard;
	}



}
