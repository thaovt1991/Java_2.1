package Week2.oop_atm;

public class Account {
    private String name= "Nguyen Van A" ;
    private long money = 1200000 ;
    private String [] arr_action = new  String [5] ;
    private  long [] arr_money = new long[5];

    public Account(){};

    public String getName(){ return this.name ; }

    public long getMoney(){return  this.money ;}

    public void rechargeMoney(long money) {
        this.money += money ;
        for (int i = 4; i > 0 ; i --){
            this.arr_action[i] = this.arr_action[i-1] ;
            this.arr_money[i] = this.arr_money[i-1];
        }
        this.arr_action [0] = "Nap tien";
        this.arr_money [0] = money;
    }

    public void withdrawMoney(long money) {
        this.money -= money ;
        for (int i = 4; i > 0 ; i --){
            this.arr_action[i] = this.arr_action[i-1] ;
            this.arr_money[i] = this.arr_money[i-1];
        }
        this.arr_action [0] = "Rut tien";
        this.arr_money [0] = money;
    }

    public String transactionHistory(){
        String str ="";
        for (int i =0 ; i < this.arr_action.length ; i++){
           str += " " + (i+1) + ". " + this.arr_action[i] +", "+ this.arr_money[i]+ " vnd\n";
        }
        return str ;
    }

}
