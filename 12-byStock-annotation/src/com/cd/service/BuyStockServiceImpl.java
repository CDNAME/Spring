package com.cd.service;

import com.cd.dao.IAccoutDao;
import com.cd.dao.IStockDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyStockServiceImpl implements IBuyStockService {
    private IAccoutDao adao;
    private IStockDao sdao;

    public void setAdao(IAccoutDao adao) {
        this.adao = adao;
    }

    public void setSdao(IStockDao sdao) {
        this.sdao = sdao;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void openAcount(String aname, double money) {
        adao.insertAccount(aname, money);
    }
    
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void openStock(String sname, int amount) {
        sdao.insertStock(sname, amount);
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor=BuyStockException.class)
    @Override
    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
        boolean isBuy = true;   //true表示买股票
        adao.updateAccount(aname, money, isBuy);
        if(1 == 1) {
            throw new BuyStockException("购买股票异常");
        }
        sdao.updateStock(sname, amount,isBuy);
    }
}
