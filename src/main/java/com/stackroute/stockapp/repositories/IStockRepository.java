/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stackroute.stockapp.repositories;

import com.stackroute.stockapp.models.Stock;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author SR-Anil
 */
public interface IStockRepository {

    void addStock(Stock s);

    void deleteStock(int id);

    Optional<List<Stock>> getAllStocks();

    void modifyStock(int id, Stock newStock);
    Stock getFirst();
}
