package Group_Project;

import java.sql.*;

public class CreateTables{
	public static void main(String[] args) throws Exception {
		Statement stmt = null;
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team009", "team009", "9e81b723")){
			stmt = con.createStatement();
			/*int count = stmt.executeUpdate("CREATE TABLE Patient("
					+ "patientID INT(5) NOT NULL,"
					+ "houseNumber INT(3) NOT NULL,"
					+ "postcode VARCHAR(7) NOT NULL,"
					+ "title VARCHAR(5),"
					+ "forename VARCHAR(30),"
					+ "surname VARCHAR(40),"
					+ "dateOfBirth DATE,"
					+ "phoneNumber VARCHAR(15),"
					+ "PRIMARY KEY(patientID),"
					+ "FOREIGN KEY(houseNumber, postcode) REFERENCES Address(houseNumber, postcode))");
			int insert = stmt.executeUpdate("INSERT INTO Patient VALUES(3,'8','NG318GE', 'Miss', 'Grace','Clare','1997-01-19','07957118543')");
			ResultSet res = stmt.executeQuery("SELECT * FROM Patient");
			while (res.next()){
				int houseNumber = res.getInt("houseNumber");
				String postcode = res.getString("postcode");
				String title = res.getString("title");
				String forename = res.getString("forename");
				String surname = res.getString("surname");
				Date dateOfBirth = res.getDate("dateOfBirth");
				String phoneNumber = res.getString("phoneNumber");
				System.out.println(title + " " + forename + " " + surname + " lives at " + houseNumber + " " + postcode + " and was born on " + dateOfBirth + " and their phone number is " + phoneNumber);
			}
			res.close();
			
			
			int count = stmt.executeUpdate("CREATE TABLE Appointment("
					+ "appointmentId INT(20) NOT NULL,"
					+ "patientID INT(5) NOT NULL,"
					+ "appointmentDate DATE,"
					+ "startTime VARCHAR(5),"
					+ "endTime VARCHAR(5),"
					+ "partner VARCHAR(20),"
					+ "PRIMARY KEY(appointmentId),"
					+ "CONSTRAINT patientID_FK FOREIGN KEY(patientID) REFERENCES Patient(patientID))");
			
			
			int insert = stmt.executeUpdate("INSERT INTO Appointment VALUES(1,1,'2017-11-11','12:30','12:50','Hygienist')");
			ResultSet res = stmt.executeQuery("SELECT * FROM Appointment");
			while (res.next()) {
				int appointmentId = res.getInt(1);
				int patientId = res.getInt(2);
				Date date = res.getDate(3);
				String startTime = res.getString(4);
				String endTime = res.getString(5);
				String partner = res.getString(6);
				System.out.println(appointmentId + " " + patientId + " " + date + " " + startTime + " " + endTime + " " + partner);
			}
			
			int count = stmt.executeUpdate("CREATE TABLE Treatment("
					+ "treatmentName VARCHAR(30) NOT NULL,"
					+ "cost INT(4),"
					+ "PRIMARY KEY(treatmentName))");
					
			int insert = stmt.executeUpdate("INSERT INTO Treatment VALUES"
					+ "('Hygiene Visit',45),"
					+ "('Check-up',45),"
					+ "('Silver Amalgam Filling',90),"
					+ "('White Composite Resin Filling',150),"
					+ "('Gold Crown Fitting',500)");
			ResultSet res = stmt.executeQuery("SELECT * FROM Treatment");
			while (res.next()) {
				String name = res.getString(1);
				int cost = res.getInt(2);
				System.out.println(name + " " + cost);
			}
			
			int count = stmt.executeUpdate("CREATE TABLE Visit("
					+ "appointmentId INT(20) NOT NULL,"
					+ "treatmentName VARCHAR(30) NOT NULL,"
					+ "paidFor BOOL DEFAULT FALSE,"
					+ "PRIMARY KEY(appointmentId, treatmentName),"
					+ "FOREIGN KEY(appointmentId) REFERENCES Appointment(appointmentId),"
					+ "FOREIGN KEY(treatmentName) REFERENCES Treatment(treatmentName))");
			
			int insert = stmt.executeUpdate("INSERT INTO Visit(appointmentId,treatmentName) VALUES(1,'Hygiene Visit')");
			ResultSet res = stmt.executeQuery("SELECT * FROM Visit");
			while (res.next()) {
				int appointment = res.getInt(1);
				String Treatment = res.getString(2);
				System.out.println(appointment + " " + Treatment);
			}
			
			int count = stmt.executeUpdate("CREATE TABLE HealthcarePlan("
					+ "planName VARCHAR (40) NOT NULL,"
					+ "monthlyCost INT(2),"
					+ "checkUpsCovered INT(2),"
					+ "hygieneVisitsCovered INT(2),"
					+ "repairWorkCovered INT(2),"
					+ "PRIMARY KEY(planName))");
			int insert = stmt.executeUpdate("INSERT INTO HealthcarePlan VALUES"
					+ "('NHS Free Plan',0,2,2,6),"
					+ "('Maintenance Plan',15,2,2,0),"
					+ "('Oral Health Plan',21,2,4,0),"
					+ "('Dental Repair Plan',36,2,2,2)");
			ResultSet res = stmt.executeQuery("SELECT * FROM HealthcarePlan");
			while (res.next()) {
				String planName = res.getString("planName");
				int cost = res.getInt(2);
				int checkup = res.getInt(3);
				int hygiene = res.getInt(4);
				int repair = res.getInt(5);
				System.out.println(planName + " " + cost + " " + checkup + " " + hygiene + " " + repair);
			}
			
		int count = stmt.executeUpdate("CREATE TABLE TreatmentsUsed("
				+ "patientID INT(5) NOT NULL,"
				+ "planName VARCHAR(40) NOT NULL,"
				+ "checkUpsUsed INT(2) DEFAULT 0,"
				+ "hygieneVisitsUsed INT(2) DEFAULT 0,"
				+ "repairsUsed INT(2) DEFAULT 0,"
				+ "PRIMARY KEY(patientID, planName),"
				+ "FOREIGN KEY(patientID) REFERENCES Patient(PatientID),"
				+ "FOREIGN KEY(planName) REFERENCES HealthcarePlan(planName))");
		int insert = stmt.executeUpdate("INSERT INTO TreatmentsUsed VALUES(1,'Maintenance Plan',0,1,0)");
		ResultSet res = stmt.executeQuery("SELECT * FROM TreatmentsUsed");
		while (res.next()) {
			String planName = res.getString(2);
			int patient = res.getInt(1);
			int checkup = res.getInt(3);
			int hygiene = res.getInt(4);
			int repair = res.getInt(5);
			System.out.println(planName + " " + patient + " " + checkup + " " + hygiene + " " + repair);
		}
		*/	
		
			
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