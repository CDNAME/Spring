package com.cd.dao;

public interface IAccoutDao {
    void insertAccount(String aname, double money);

    void updateAccount(String aname, double money, boolean isBuy);
}
