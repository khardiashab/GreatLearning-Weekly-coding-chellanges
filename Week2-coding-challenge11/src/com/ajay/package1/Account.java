package com.ajay.package1;

class Account{
  // create two private propertry CustomerName and accountNO
  protected String customerName;
  protected int accountNo;


  public Account(String customerName, int accountNo) {
    this.customerName = customerName;
    this.accountNo = accountNo;
  }

  // create a display method to show them
  void display(){
    System.out.println("Coustomer name   : " + customerName + " \nAccount No    : " + accountNo);
  }

}
