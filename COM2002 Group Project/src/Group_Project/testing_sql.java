package Group_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testing_sql {
	public static void main(String[] args) throws Exception {
		Statement stmt = null;
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team009", "team009", "9e81b723")){
			stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("SELECT * FROM HealthcarePlan");
			while (res.next()) {
				String planName = res.getString("planName");
				int cost = res.getInt(2);
				int checkup = res.getInt(3);
				int hygiene = res.getInt(4);
				int repair = res.getInt(5);
				System.out.println(planName + " " + cost + " " + checkup + " " + hygiene + " " + repair + " ");
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
