package net.hb.day0702;

import net.common.bit.Dunkin;

public class A003 {

  public static void main(String[] args) {

    Bank bk = new Bank();
    //    System.out.println("password " + bk.pwd); 에러발생
    bk.cal();

    Dunkin dd = new Dunkin();
    String name = dd.coffee();
    dd.donuts(7);
  }
}
