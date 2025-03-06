/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policemanagementsystem;
import java.sql.*;
/**
 *
 * 
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException{
        Connection con;
        Statement st;
        ResultSet rs;
        PreparedStatement pst;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/policemanagementsystem","root","9220");
            st = con.createStatement();
            /*String q1 = "CREATE TABLE STUDENT(ID INT,NAME VARCHAR(30),AGE INT)";
            int n = st.executeUpdate(q1);
            System.out.println(n+"Table Creation Successful");
            String q2 = "INSERT INTO STUDENTS VALUES(3,'RAGHU',18,'BANGLORE')"+",(4,'GNANENDHAR',18,'VELLORE')";
            int n1 = st.executeUpdate(q2);
            System.out.println(n1+"Insertion Successful");
            String q3 = "INSERT INTO STUDENT VALUES(?,?,?)";
            pst = con.prepareStatement(q3);
            pst.setInt(1, 2);
            pst.setString(2,"MUKUNDA");
            pst.setInt(3, 16);
            int n2 = pst.executeUpdate();
            System.out.print(n2+"Interactive Insertion Successful");
            String q4 = "SELECT * FROM STUDENT";
            rs = st.executeQuery(q4);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            String q5 = "ALTER TABLE STUDENT ADD COLUMN LOCATION VARCHAR(30)";
            int n3 = st.executeUpdate(q5);
            System.out.println(n3+"Alter Successful");
            String q6 = "UPDATE STUDENT SET LOCATION=? WHERE ID = 2";
            pst = con.prepareStatement(q6);
            pst.setString(1,"ANANTAPUR");
            int n4 = pst.executeUpdate();
            System.out.println(n4+"Insertion successful");
            
            String q7 = "RENAME TABLE STUDENTS TO STUDENT";
            int n5 = st.executeUpdate(q7);
            System.out.println(n5+"Rename Successful");
            */
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
               
        }
    }
}
