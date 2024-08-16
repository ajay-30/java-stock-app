/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stackroute.stockapp.models;

import java.io.Serializable;

/**
 *
 * @author SR-Anil
 */
public class Stock implements Serializable{
    public  int id ;
    public String name;
    public double rate;
    public String type;

    public Stock() {
    }

    public Stock(int id, String name, double rate, String type) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", name=" + name + ", rate=" + rate + ", type=" + type + '}';
    }
    
    
}
