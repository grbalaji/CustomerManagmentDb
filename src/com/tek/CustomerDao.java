package com.tek;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

class CustomerDao{


    public  int insertQuery(String query)
	{
		int flag=0;
		try 
		{  
            Connection connection = DbHandler.getConnection();
            Statement statement=connection.createStatement();

			flag=statement.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
			return  flag;
		}



}