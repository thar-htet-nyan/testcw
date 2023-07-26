

package com.napier.coursework;

import java.sql.*;
import java.util.ArrayList;

public class ExtractCountry {

    private Connection conn = null;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void CountryReport() {
        display();
    }

    public ArrayList<Country> getAllSalaries()
    {
        try
        {
            String query = "Select * from country";
            // Create an SQL statement
            Statement stmt = conn.createStatement();
            // Execute SQL statement
            ResultSet result_data = stmt.executeQuery(query);
//            ResultSet rset = dbconn.extract_data(query);
            // Extract employee information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (result_data.next())
            {
                Country cnt = new Country();
//                emp.emp_no = rset.getInt("employees.emp_no");
//                emp.first_name = rset.getString("employees.first_name");
//                emp.last_name = rset.getString("employees.last_name");
//                emp.salary = rset.getInt("salaries.salary");
                cnt.Capital = result_data.getString("country.Capital");
                cnt.Code = result_data.getString("country.Code");
                countries.add(cnt);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    public void display(){
        ArrayList<Country> lol = getAllSalaries();
        for (int i = 0; i < lol.size();i++)
        {
            System.out.println("Code: " + lol.get(i).Code + "Capital: " + lol.get(i).Capital);
        }
    }
}
