package net.hb.day0701;

import net.hb.day0630.Father;

public class BitCamp_4 extends Father implements AAA, BBB {

  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    bc4.game();

  }

  public void game() {
    System.out.println("삼국지");
    this.bank();
  }

  @Override
  public void apple() {
    System.out.println("BitCamp_4 소속의 apple 메소드");
  }

  @Override
  public String memo() {
    return null;
  }

  @Override
  public boolean nullCheck(int key) {
    return false;
  }

  @Override
  public void blue() {

  }

}
