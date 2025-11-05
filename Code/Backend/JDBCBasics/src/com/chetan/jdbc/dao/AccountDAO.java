package com.chetan.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Root@1234");
			System.out.println(connection);
			Statement statement = connection.createStatement();
//			int executeUpdate = statement.executeUpdate("insert into account value(1,'n','chetan',10000)");
//			System.out.println(executeUpdate+" rows got inserted");
//			int executeUpdate = statement.executeUpdate("update account set bal=50000 where accno=1");
//			System.out.println(executeUpdate+" rows got updated");
//			int executeUpdate = statement.executeUpdate("delete from account where accno=1");
//			System.out.println(executeUpdate+" rows got deleted");
			ResultSet res = statement.executeQuery("select * from account");
			while(res.next()) {
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
