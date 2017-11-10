package Group_Project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testing_sql {
	public static void main(String[] args) throws Exception {
		Statement stmt = null;
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team009", "team009", "9e81b723")){
			stmt = con.createStatement();
			
			
			ResultSet res = stmt.executeQuery("SELECT * FROM TreatmentsUsed");
			while (res.next()) {
				//String planName = res.getString("planName");
				//String title = res.getString("title");
				//String forename = res.getString("forename");
				//String surname = res.getString("surname");
				String id = res.getString("startDate");
				//System.out.println(" " + title + " " + forename + " " + surname + " " + dateofbirth + " ");
				System.out.println(id);
			}
					
			//RETRIEVES COLUMN NAMES FOR A TABLE
			DatabaseMetaData meta = con.getMetaData();
		     ResultSet resultSet = meta.getColumns("team009", null, "TreatmentsUsed", "%");
		     while (resultSet.next()) {
		       System.out.println(resultSet.getString(4));
			}
		
			
		}
		catch (SQLException ex) {
				ex.printStackTrace();
		}
		finally {
				if (stmt != null)
					stmt.close();
		}
	
	}
}