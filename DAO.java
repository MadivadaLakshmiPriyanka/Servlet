package com.day2;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	Connection conn = DataBaseConnection.getDBConnection();
	public int insertStudentData(Student student) throws ClassNotFoundException, SQLException{
		String sql = "insert into studentdata values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, student.getStudentId());
		pst.setString(2,student.getStudentName());
		pst.setString(3, student.getEmail());
		return pst.executeUpdate();
	}
	
	public List<Student> getStudentDetails() throws SQLException{
		List<Student> stdList = new ArrayList();
		String sql = "select * from studentdata";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			Student std = new Student(id,name,email);
			stdList.add(std);
		}
		return stdList;
	}
	
	
	
	
	
	
	
	

}
