package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import exception.RecordNotCreatedException;
import exception.RecordNotDeletedException;
import exception.RecordNotFoundException;
import exception.RecordNotUpdatedException;
import model.IndividualData;

/**
 * 
 * @author Jonathan Parrish
 *
 */
@LocalBean
@Local(DataAccessInterface.class)
@Stateless
public class IndividualDataService implements DataAccessInterface<IndividualData> {

	// Instantiate connection code
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3307/stockboi";
	String username = "root";
	String password = "root";
		
	public IndividualDataService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int CreateT(IndividualData model) throws RecordNotCreatedException {
		try {
			//Create the sql
			String sql = String.format("INSERT INTO `stockboi`.`data` "
					+ "(`PRICE`, `HIGH`, `LOW`) VALUES (%f, %f, %f)",
					model.getPrice(),
					model.getHigh(),
					model.getLow());
			//Get a connection
			this.conn = DriverManager.getConnection(url, username, password);
			
			//Create the statement
			Statement stmt = this.conn.createStatement();
			
			//Query the database
			int rowsAffected = stmt.executeUpdate(sql);
			
			//Return rows affected
			return rowsAffected;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RecordNotCreatedException();
		}finally {
			if(this.conn != null) {
				try {
					this.conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public IndividualData ReadT(IndividualData model) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Read the data by the date
	 */
	@Override
	public IndividualData ReadTByField(IndividualData model) throws RecordNotFoundException {
		try {
			String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(model.getDate());
			//Create the sql
			String sql = String.format("SELECT `DATA_ID`, `DATE`, `PRICE`, `HIGH`, `LOW` "
					+ "FROM `stockboi`.`data` WHERE `DATE` = '%s'", 
					formattedDate);
			
			//Get a connection
			this.conn = DriverManager.getConnection(url, username, password);
			
			//Create the statement
			Statement stmt = this.conn.createStatement();
			
			//Execute the query
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next();
			
			//Return a model
			return new IndividualData(
					rs.getInt("DATA_ID"), 
					rs.getDate("DATE"), 
					rs.getFloat(Price"), 
					rs.getFloat("HIGH"), 
					rs.getFloat("LOW"));
		}catch(Exception e) {
			e.printStackTrace();
			throw new RecordNotFoundException();
		}finally {
			if(this.conn != null) {
				try {
					this.conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public List<IndividualData> ReadAllT(IndividualData model) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int UpdateT(IndividualData model) throws RecordNotUpdatedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteT(IndividualData model) throws RecordNotDeletedException {
		// TODO Auto-generated method stub
		return 0;
	}

}
