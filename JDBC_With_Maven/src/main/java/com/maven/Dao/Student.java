package com.maven.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {

	public void Insert() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "57210322S7");

			PreparedStatement ps = c.prepareStatement("insert into student values(?,?,?)");

			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter your Student ID:");
			int id = sc.nextInt();

			System.out.println("Please enter the student's name:");
			String name = sc.next();

			System.out.println("Please enter the name of the city to which the student belongs:");
			String city = sc.next();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, city);

			int i = ps.executeUpdate();
			if (i > 0)
			{
                System.out.println("Data Inserted 👍");
            }
			else 
            {
                System.out.println("Data was not inserted. Please try again 🤷‍♀️");
            }

		} catch (Exception e) {

			e.getStackTrace();
		}

	}

	public void Update() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","57210322S7");
			
			PreparedStatement ps = c.prepareStatement("update student set name=? ,city=? where id = ?");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Please update the student's name as follows: ");
			String name = sc.next();

			System.out.println("Please provide the name of the city where the student resides.");
			String city = sc.next();

			System.out.println("Please enter the Student ID that you would like to update:");
			int id = sc.nextInt();
			
			ps.setString(1,name);
			ps.setString(2,city);
			ps.setInt(3,id);
			
			int i =ps.executeUpdate();
            if (i > 0)
            {
                System.out.println("Data Updated 👍");
            } 
            else
            {
                System.out.println("Data was not updated. Please try again 🤷‍♀️");
            }
		}
		
		catch(Exception e )
		{
			e.getStackTrace();
		}
		
	}

	public void Delete() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "57210322S7");

			PreparedStatement ps = c.prepareStatement("Delete from student where id = ?");

			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter the Student ID that you would like to delete:");
			int id = sc.nextInt();

			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i > 0)
			{
                System.out.println("Data Deleted 👍");
            } 
			else
			{
                System.out.println("Data was not deleted. Please try again 🤷‍♀️");
            }

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void Display() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "57210322S7");

			PreparedStatement ps = c.prepareStatement("Select * from Student ");

			ResultSet rs = ps.executeQuery("select * from student");

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);

				System.out.println(" ID:" + id + " ---Name:" + name + " ---City:" + city);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}