package net.hb.day0701;

public class BitCamp_2 extends LA {

  public static void main(String[] args) {
    BitCamp_2 bk = new BitCamp_2();
    bk.book();

    //    메인에서는 static 때문에 호출할 수 없음
    //    호출할 수 없기 때문에 book안에 넣어서 book을 불러옴 or new 
    //    super.cherry();    
    //    this.cherry();

  }

  public void book() {
    System.out.println("book 몽블랑");
    super.cherry(); // 인터페이스에 있는 것 
    this.cherry();  // 내가 여기서 재정의한 것
  }

  @Override
  public void cherry() {
    System.out.println("제주산 체리 11:09");

  }


}
