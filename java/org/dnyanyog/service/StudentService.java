package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.DBUtils;

public class StudentService {

	public List<String> getFirstNames() {
		List<String> names = new ArrayList<>();
		
		try {
			
			ResultSet rs = DBUtils.executeSelectQuery("select * from student");
			
			while(rs.next()) {
				names.add(rs.getString(2)+" "+rs.getString(3));
			}
			return names;
		} catch (SQLException e) {
			e.printStackTrace();
			return names;
		}
	}

	public List<String> getEmails() {
		List<String> mails = new ArrayList<>();
		try {
			ResultSet rs = DBUtils.executeSelectQuery("select * from student");
			
			while(rs.next()) {
				mails.add(rs.getString(4)+" Mobile :"+rs.getString(5));
			}
			return mails;
		} catch(SQLException e) {
			e.printStackTrace();
			return mails;
		}
		
	}

}
