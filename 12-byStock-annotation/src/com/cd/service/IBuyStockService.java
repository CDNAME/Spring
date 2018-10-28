package com.cd.service;

public interface IBuyStockService {
    void openAcount(String aname, double money);
    void openStock(String sname, int amount);
    
    void buyStock(String aname, double money, String sname, int amount) throws BuyStockException;
}
