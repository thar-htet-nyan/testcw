package com.napier.coursework;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        DatabaseConnection dbconn = new DatabaseConnection();
        dbconn.connect();

        Connection conn = dbconn.getConn();

        ExtractCountry ec = new ExtractCountry();
        ec.setConn(conn);
        ec.CountryReport();




        dbconn.disconnect();

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter: ");
//        String inp = scan.nextLine();
//        System.out.println("Typed: " + inp);




    }

}
