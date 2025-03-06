/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policemanagementsystem.Police;

/**
 *
 * 
 */
class ComplaintsTable {
    private int id;
    private String description,address;
    ComplaintsTable(int id,String description,String address){
        this.id = id;
        this.description = description;
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public String getAddress(){
        return address;
    }
    
}
