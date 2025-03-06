/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policemanagementsystem.Police;

/**
 *
 *
 */
class CriminalTable {
    private int id,age;
    private float height;
    private String name,gender,address,father_name,mobile_no,crime,identificationmarks;
    
    public CriminalTable(int id,String name,String address,int age,String gender,String crime,String father_name,float height,String identificationmarks ,String mobile_no){
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.crime = crime;
        this.father_name = father_name;
        this.height = height;
        this.identificationmarks = identificationmarks;
        this.mobile_no = mobile_no;
        
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getFatherName(){
        return father_name;
    }
    public String getAddress(){
        return address;
    }
    public String getGender(){
        return gender;
    }
    public String getIdentificationmarks(){
        return identificationmarks;
    }
   
    public String getMobileNo(){
        return mobile_no;
    }
    public String getCrime(){
        return crime;
    }
    public float getHeight(){
        return height;
    }

}
