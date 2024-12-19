package com.maven.JDBC_With_Maven;

import java.util.Scanner;

import com.maven.Dao.Student;

public class App {
	public static void main( String[] args )
    {
    	
    	
        Student s = new Student();
        int option ;
        do 
        {
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Please select your option.:");
        	System.out.println("1)Insert Data.\n2)Update Data.\n3)Delete Data.\n4)Display Data.");
        	 
        	option = sc.nextInt();
        	
        	switch(option)
        	{
        		case 1 : s.Insert();
        		break;
        		
        		case 2 :s.Update();
        		break;
        		
        		case 3 :s.Delete();
        		break;
        		
        		case 4 : s.Display();
        		break;
        		
        		case 5 : sc.close();
        		System.out.println("Thank You 🙏.......");
        		break;
        			
        	}
        	
        	
        }while(option!=5);
       	
    }
}
