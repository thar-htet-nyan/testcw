

package com.napier.coursework;

import java.sql.*;
import java.util.ArrayList;

public class ExtractCountry {

    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    public ArrayList<Country> getAllSalaries()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
//            String strSelect =
//                    "SELECT employees.emp_no, employees.first_name, employees.last_name, salaries.salary "
//                            + "FROM employees, salaries "
//                            + "WHERE employees.emp_no = salaries.emp_no AND salaries.to_date = '9999-01-01' "
//                            + "ORDER BY employees.emp_no ASC";
            String strSelect = "SELECT * FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cnt = new Country();
//                emp.emp_no = rset.getInt("employees.emp_no");
//                emp.first_name = rset.getString("employees.first_name");
//                emp.last_name = rset.getString("employees.last_name");
//                emp.salary = rset.getInt("salaries.salary");
                cnt.Capital = rset.getString("country.Capital");
                cnt.Code = rset.getString("country.Code");
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
}
