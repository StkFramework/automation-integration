package com.example.test.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.test.structure.RequestSearchResultOutput;
import com.softtek.automation.ErrorType;
import com.softtek.automation.ExecutionContext;
import com.softtek.automation.ExecutionResult;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.functions.CSVFunctions;
import com.softtek.automation.logic.AbstractBusinessCase;
import com.softtek.automation.structure.AbstractStructure;

@Component
public class SearchRequestBusinessCase extends AbstractBusinessCase {

	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private AppActions AppActions;
	
	
	private String fileSourcePath;
	private char delimiter;
	private CSVFunctions<RequestSearchResultOutput> csvFunctions;
	List<RequestSearchResultOutput> dsResultList;
	List<RequestSearchResultOutput> uiResultList;
	
	
	@Override
	protected void init(ExecutionContext context, ExecutionResult result) {	
		TestLogger.getInstance(this).info("init()");
		fileSourcePath = "C:\\workspace\\automation\\automation-integration\\softa-impl\\src\\main\\resources\\dashBoardData.csv";
		delimiter = ',';		
		
		TestLogger.getInstance(this).info("fileSourcePath -> " + fileSourcePath);
		TestLogger.getInstance(this).info("delimiter -> " + delimiter);
	}

	@Override
	protected void fillFormWithData(ExecutionContext context, ExecutionResult result) {
		TestLogger.getInstance(this).info("fillFormWithData()");
		
		UIActions.ExecuteJS("arguments[0].click()", ".//*[@id='yui-gen2']");
		
		//assertTrue(UIActions.ClickOnElement(".//*[@id='yui-gen2']",null));		
		assertTrue(UIActions.ClickOnElement(".//*[@id='SEARCH_REQUESTS']/a",null));
		assertTrue(UIActions.TypeTextOn(".//*[@id='REQWB.CREATED_BYAC_TF']", null, "jose.san"));
		assertTrue(UIActions.ClickOnElement("html/body/div[5]/div/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[15]/td[7]/input[1]",null));
		assertTrue(UIActions.ClickOnElement(".//*[@id='SEARCH_BUTTON_LINK']/a",null));
	}

	@Override
	protected void readDataSources(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		TestLogger.getInstance(this).info("readDataSources()");
		
		csvFunctions = new CSVFunctions<RequestSearchResultOutput>();
		
		try {			
			
			dsResultList =  csvFunctions.getInfo(this.fileSourcePath, RequestSearchResultOutput.class,this.delimiter, null);		
			TestLogger.getInstance(this).info("dsResultList.size -> " + dsResultList.size());
			TestLogger.getInstance(this).info("dsResultList -> " + dsResultList);
		
		} catch (Exception e) {
			result.setResult(false);
			result.setErrorType(ErrorType.ERROR);
			result.setMessage("An error ocurred in readDataSource() method: Exeption message is: " +  e.getMessage());
			TestLogger.getInstance(this).error(result.getMessage());
		}
	
		
	
	}

	@Override
	protected void fillWithData(ExecutionContext context, ExecutionResult result) {
		
		TestLogger.getInstance(this).info("fillWithData()");		
		
		Integer elements = (Integer) UIActions.CountElements(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text']/td[2]",null).getObjectResult();
		
		TestLogger.getInstance(this).info("elements -> " + elements);
		
		uiResultList = new ArrayList<RequestSearchResultOutput>();
		
		TestLogger.getInstance(this).info("mapping elements...");
		
		for(Integer i = 1; i <= elements; i++){
			
			String[] params = new String[]{i.toString()};
			
			RequestSearchResultOutput record = new RequestSearchResultOutput();
			
			record.setNo(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[2]/a",params).getObjectResult().toString().trim());
			record.setType(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[3]",params).getObjectResult().toString().trim());
			record.setDescription(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[4]",params).getObjectResult().toString().trim());
			record.setStatus(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[5]",params).getObjectResult().toString().trim());
			record.setAssigntedTo(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[6]",params).getObjectResult().toString().trim());
			record.setPriority(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[7]",params).getObjectResult().toString().trim());
			record.setCreatedBy(UIActions.GetText(".//*[@id='searchResultTable']/tbody/tr[@class='normal-text'][:p]/td[8]",params).getObjectResult().toString().trim());
			TestLogger.getInstance(this).info("record " + i + " ->" + record);
			
			uiResultList.add(record);
		}
		
		TestLogger.getInstance(this).info("uiResultList.size -> "+ uiResultList.size());
		TestLogger.getInstance(this).info("uiResultList -> "+ uiResultList);
	}

	@Override
	protected void checkCase(ExecutionContext context, ExecutionResult result) {
		
		TestLogger.getInstance(this).info("checkCase()");
		
		this.compareAbstractStructures(uiResultList, dsResultList);

	}
	
	
	public static void main(String []args) throws Exception{
		String fileSourcePath = "C:\\workspace\\automation\\automation-integration\\softa-impl\\src\\main\\resources\\dashBoardData.csv";
		
		CSVFunctions<RequestSearchResultOutput> csvFunctions = new CSVFunctions<RequestSearchResultOutput>();
		
		List<String[]> rowsList = csvFunctions.getInfo(fileSourcePath);
		
		List<RequestSearchResultOutput> dsResultList1 = new ArrayList<RequestSearchResultOutput>();
		
		List<RequestSearchResultOutput> dsResultList2 =  csvFunctions.getInfo(fileSourcePath,RequestSearchResultOutput.class,',',null);
		RequestSearchResultOutput record = new RequestSearchResultOutput();
		
		for(String [] recordInfo: rowsList){			
			
			
			
			record.setNo(recordInfo[0]);
			record.setType(recordInfo[1]);
			record.setDescription(recordInfo[2]);
			record.setStatus(recordInfo[3]);
			record.setAssigntedTo(recordInfo[4]);
			record.setPriority(recordInfo[5]);
			record.setCreatedBy(recordInfo[6]);
			
			dsResultList1.add(record);
		}
		
		System.out.println(dsResultList1);
		System.out.println(dsResultList2);
	}
	
	

}
