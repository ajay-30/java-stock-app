/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stackroute.stockapp.repositories;

import com.stackroute.stockapp.models.Stock;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author SR-Anil
 */
public class StockListRepository implements IStockRepository  {
    List<Stock> stocks=new LinkedList();
    @Override
   public void addStock(Stock s){
       Optional.ofNullable(s).ifPresent(p->{
       stocks.add(p);
       System.out.println("data saved to memeory");
       });
   }
    @Override
   public void modifyStock(int id, Stock newStock){
      Optional<Stock> temp = stocks.stream().filter(s->s.id==id).findFirst();
      temp.ifPresent(t->{
      stocks.indexOf(t);
      });
   }
    @Override
   public void deleteStock(int id){
     Optional<Stock> temp = stocks.stream().filter(s->s.id==id).findFirst();
      temp.ifPresent(t->{
      stocks.remove(t);
      });}
    @Override
   public Optional<List<Stock>> getAllStocks(){
        return Optional.ofNullable(stocks);
   }
   @Override
   public Stock getFirst(){
   return stocks.getFirst();
   }
    
}
