package com.napier.coursework;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

//        try
//        {
//            // Load Database driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        }
//        catch (ClassNotFoundException e)
//        {
//            System.out.println("Could not load SQL driver");
//            System.exit(-1);
//        }
//
//        // Connection to the database
//        Connection conn = null;
//        int retries = 100;
//        for (int i = 0; i < retries; ++i)
//        {
//            System.out.println("Connecting to database...");
//            try
//            {
//                // Wait a bit for db to start
//                Thread.sleep(30000);
//                // Connect to database
//                conn = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
//                System.out.println("Successfully connected");
//                // Wait a bit
//                Thread.sleep(10000);
//                // Exit for loop
//                break;
//            }
//            catch (SQLException sqle)
//            {
//                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
//                System.out.println(sqle.getMessage());
//            }
//            catch (InterruptedException ie)
//            {
//                System.out.println("Thread interrupted? Should not happen.");
//            }
//        }
//
//
//
//        ExtractCountry ec = new ExtractCountry();
//        ec.setCon(conn);
//        ArrayList<Country> lol = ec.getAllSalaries();
//        for (int i = 0; i < lol.size();i++)
//        {
//            System.out.println("Code: " + lol.get(i).Code + "Capital: " + lol.get(i).Capital);
//        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        String inp = scan.nextLine();
        System.out.println("Typed: " + inp);


//        if (conn != null)
//        {
//            try
//            {
//                // Close connection
//                conn.close();
//            }
//            catch (Exception e)
//            {
//                System.out.println("Error closing connection to database");
//            }
//        }

    }

}
