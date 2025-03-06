 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policemanagementsystem.Police;

/**
 *
 
 */
class FirTable {
    private int id,pincode;
    private String name,district,state,address,father_name,email,complaint,mobile_no,description;
    
    public FirTable(int id,String name,String district,String state,int pincode,String address,String father_name,String email,String complaint,String mobile_no,String description ){
        this.id = id;
        this.pincode = pincode;
        this.address = address;
        this.district = district;
        this.state = state;
        this.mobile_no = mobile_no;
        this.name = name;
        this.complaint = complaint;
        this.description = description;
        this.father_name = father_name;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public int getPincode(){
        return pincode;
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
    public String getDistrict(){
        return district;
    }
    public String getState(){
        return state;
    }
    public String getComplaint(){
        return complaint;
    }
    public String getDescription(){
        return description;
    }
    public String getMobileNo(){
        return mobile_no;
    }
    public String getEmail(){
        return email;
    }
        
}
