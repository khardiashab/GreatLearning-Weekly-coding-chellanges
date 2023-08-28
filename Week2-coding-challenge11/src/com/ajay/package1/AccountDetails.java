package com.ajay.package1;


public class AccountDetails extends CurrentAccount   {
  int depositAmount;
  int withdrawalAmount;

  public AccountDetails(String customerName, int accountNo, int currentBalance, int depositAmount,
      int withdrawalAmount) {
    super(customerName, accountNo, currentBalance);
    this.depositAmount = depositAmount;
    this.withdrawalAmount = withdrawalAmount;
  }


  void display() {
    super.display();
    System.out.println("Deposit Ammount : " + depositAmount);
    System.out.println("widrawalAmount : " + withdrawalAmount);
  }
  
  //
}
