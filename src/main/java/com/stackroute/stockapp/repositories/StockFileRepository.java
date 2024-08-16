/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stackroute.stockapp.repositories;
import com.stackroute.stockapp.models.*;
import java.io.*;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author SR-Anil
 */
public class StockFileRepository implements IStockRepository {
    FileOutputStream fos;
    FileInputStream fis;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public StockFileRepository() {
    }
    
    @Override
    public void addStock(Stock s) {
        try{
            fos=new FileOutputStream("d:/stackroute/actalent/java/stocks.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
            oos.close();
        }
        catch(Exception e){System.err.println(e);}       
    }

    @Override
    public void deleteStock(int id) {
  
    }

    @Override
    public Optional<List<Stock>> getAllStocks() {
        return null;
    }

    @Override
    public void modifyStock(int id, Stock newStock) {
         
    }

    @Override
    public Stock getFirst() {
        Stock s=null;
        try{
        fis = new FileInputStream("d:/stackroute/actalent/java/stocks.dat");
        ois =new ObjectInputStream(fis);
         s = (Stock)ois.readObject();//deserialisation
        fis.close();
       // System.out.println(s);
        }catch(Exception e){System.err.println(e);}
        return s;
    }
    
}
