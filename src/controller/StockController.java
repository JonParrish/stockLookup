package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import business.StockBusinessService;
import model.StockTemp;

@ManagedBean(name="stock")
@ViewScoped
public class StockController {

	@Inject
	StockBusinessService stockService;
	
	public String ColumnChart()
	{
		return "ColumnChart.xhtml";
	}
	
	
	public StockTemp getWeek()
	{
		try {
			return stockService.CreateWeek();
		}catch(Exception e) {
			e.printStackTrace();
			return new StockTemp();
		}
		
	}
	
	
}
