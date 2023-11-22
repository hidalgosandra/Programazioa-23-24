package model;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount){
        if (amount <= amount) {
            balance = balance - amount;
        }else{
            System.out.println("Amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance) {
            another.credit(amount);
        }else{
            System.out.println("Amount exceeded");
        }
        return balance;
    }
    public String toString(){
        String ac;
        ac = "Id: " + id + " name: " + name + " balance: " + balance;
        return ac; 
    }

}
