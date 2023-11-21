package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBConnection;
import com.model.Student;

public class StudentDAO {

	
	public Student studentLogin(String emailId,String password){
		
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		if(con == null){
			System.out.println("Cannot connect to the database");
			return null;
		}
		
		try {
			
			String selectQry = "select * from student where emailId = ? and password = ?";
			pst = con.prepareStatement(selectQry);
			pst.setString(1,emailId);
			pst.setString(2,password);
			rs = pst.executeQuery();
			
			if(rs.next()){
				Student student = new Student();
				student.setStudentId(rs.getInt(1));
				student.setFirstName(rs.getString(2));
				student.setLastName(rs.getString(3));
				student.setBranch(rs.getString(4));
				student.setYear(rs.getInt(5));
				student.setGender(rs.getString(6));
				student.setAge(rs.getInt(7));
				student.setEmailId(rs.getString(8));
				student.setPassword(rs.getString(9));
				student.setMarks(rs.getDouble(10));
				
				return student;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally{
			
			if(con != null){
				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
}
