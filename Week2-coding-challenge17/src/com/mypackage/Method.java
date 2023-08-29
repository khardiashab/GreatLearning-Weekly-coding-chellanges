package com.mypackage;
public class Method {

  public int num = 10, output;
  
  public int performLeftShift(){
    int res = num <<2;
    return res;
  }

  public void performRightShift(int val, int digitToShift){
    output = val >> digitToShift;
  }

}
