package business;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import data.IndividualDataService;
import exception.RecordNotFoundException;
import model.IndividualData;
import model.StockTemp;

/**
 * 
 * @author Jonathan Parrish
 *
 */
@Stateless
@Local(StockBusinessService.class)
@LocalBean
public class StockBusinessService implements StockBusinessInterface {

	@Inject
	IndividualDataService ids;
	
	public StockTemp CreateWeek() throws RecordNotFoundException
	{
		Date today = new Date();
		ArrayList<IndividualData> data = new ArrayList<IndividualData>();
		for(int i = 6; i >= 0 ; i--) {
			Date priceDate = new Date(today.getTime() - (i * 24 * 60 * 60 * 1000));
			IndividualData price = new IndividualData();
			price.setDate(priceDate);
			data.add(ids.ReadTByField(price));
		}
		StockTemp week = new StockTemp();
		week.setDayOne(data.get(0).getDate().toString());
		week.setDayTwo(data.get(1).getDate().toString());
		week.setDayThree(data.get(2).getDate().toString());
		week.setDayFour(data.get(3).getDate().toString());
		week.setDayFive(data.get(4).getDate().toString());
		week.setDaySix(data.get(5).getDate().toString());
		week.setDaySeven(data.get(6).getDate().toString());
		week.setPriceOne(data.get(0).getPrice());
		week.setPriceTwo(data.get(1).getPrice());
		week.setPriceThree(data.get(2).getPrice());
		week.setPriceFour(data.get(3).getPrice());
		week.setPriceFive(data.get(4).getPrice());
		week.setPriceSix(data.get(5).getPrice());
		week.setPriceSeven(data.get(6).getPrice());
		
		return week;
	}
}
