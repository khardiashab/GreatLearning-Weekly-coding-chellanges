package com.ajay.package1;

public class CurrentAccount extends  Account{
  protected int currentBalance; //      

  public CurrentAccount(String customerName, int accountNo, int currentBalance) {
    super(customerName, accountNo);
    this.currentBalance = currentBalance;

  }

  void display(){
    super.display();
    System.out.println("Current balance: " + currentBalance);
  }
  
}
