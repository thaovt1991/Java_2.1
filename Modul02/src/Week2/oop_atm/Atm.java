package Week2.oop_atm;

import java.text.DecimalFormat;

public class Atm {
    private long money = 10000000 ;

    public Atm(){} ;

    public Atm (long money){
        this.money = money ;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
    @Override
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return "So tien Atm con lai la " + formatter.format(money) ;
    }
}