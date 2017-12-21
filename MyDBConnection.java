import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

// This is better if it is a singleton 
public class MyDBConnection {
	public Connection connection;
	public PreparedStatement ekle;
	public PreparedStatement studentekle;
	public PreparedStatement courseekle;
	public PreparedStatement gradeekle;
	public PreparedStatement yearekle;
	public PreparedStatement semesterekle;
	public PreparedStatement sectionekle;

	public PreparedStatement studentlistele;
	public PreparedStatement courselistele;
	public PreparedStatement gradelistele;
	public PreparedStatement yearlistele;
	public PreparedStatement semesterlistele;
	public PreparedStatement sectionlistele;
	
	
	public PreparedStatement listele;
	public static MyDBConnection instance = null;
	MyDBConnection() {
		// A private constructor restricts the creation of an object from this class... 
		connection = null;
	}
	
	// Java is easy. Use synchronized for thread-safety. 
	// This synchronized approach can be improved if it is checked 
	// inside the method. 
	
	
	
	
	
	
	synchronized public static MyDBConnection getInstance() {
		if(instance == null) {
			instance = new MyDBConnection(); 
			instance.connect();
		}
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	public void connect() {
		if (connection == null) {
			try {
				File dosya = new File("mydatabase.db");
				boolean firstRun = !dosya.exists(); // if file does not exist, then it is first run
				connection = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
				
				if(firstRun) {
					Statement statement = connection.createStatement();
					statement.executeUpdate("create table mytable(name string)");
					
					statement.executeUpdate("create table student(studentName string,studentId int)");
					statement.executeUpdate("create table course(courseName int,courseId string)");
					statement.executeUpdate("create table grade(gradeType string,gradeNot int)");
					statement.executeUpdate("create table year(yearId int)");
					statement.executeUpdate("create table semester(semesterName string)");
					statement.executeUpdate("create table section(sectionId int,sectionHour int)");
					
					
					
				}
					
				
				studentekle = connection.prepareStatement("insert into student(studentName,studentId) values(?,?)");
				courseekle = connection.prepareStatement("insert into course(courseName,courseId) values(?,?)");
				gradeekle = connection.prepareStatement("insert into grade(gradeType,gradeNot) values(?,?)");
				yearekle = connection.prepareStatement("insert into year(yearId) values(?)");
				semesterekle = connection.prepareStatement("insert into semester(semesterName) values(?)");
				sectionekle = connection.prepareStatement("insert into section(sectionId,sectionHour) values(?,?)");
			
				studentlistele = connection.prepareStatement("select * from student");
				courselistele = connection.prepareStatement("select * from student");
				gradelistele = connection.prepareStatement("select * from student");
				yearlistele = connection.prepareStatement("select * from student");
				semesterlistele = connection.prepareStatement("select * from student");
				sectionlistele = connection.prepareStatement("select * from student");
				
				
				
				ekle = connection.prepareStatement("insert into mytable(name) values(?)");
				listele = connection.prepareStatement("select * from mytable");
				
				
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Connection to sql failed");
			}
		}
	}
	
	
	
	
	
	
	
	
	public void insertText(String t) {
		try {
			ekle.setString(1, t);
			ekle.execute();
		} catch(SQLException e) {}
	}
	
	
	
	
	
	
	
	public void loopText() {
		try {
			ResultSet rs = listele.executeQuery();
			while(rs.next()) {
				//System.out.println(rs.getString("name"));
				JOptionPane.showMessageDialog(null, rs.getString("name"));
			}
		} catch(SQLException e) {}
	}
	
	
	
	
	
	
	
	
	public ArrayList<String> getList() {
		ArrayList<String> l = new ArrayList<>();
		try {
			ResultSet rs = listele.executeQuery();
			while(rs.next()) {
				l.add(rs.getString("name"));
			}
		} catch(SQLException e) {}
		return l;
	}
}
