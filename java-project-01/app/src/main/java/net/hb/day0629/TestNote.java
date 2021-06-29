package net.hb.day0629;

public class TestNote {

  public static void main(String[] args) {

    System.out.println("곽용태 9:42");
    System.out.println("까사노 9:43");
    TestNote tn = new TestNote();
    tn.note();

  }


  public String book() { //문제1 - 같은 문서의 메소드를 호출 
    String my = "몽블랑"; // 지역변수 = local variable - 어린아이 = 철저하게 보호받고 있다.
    return my;
  }

  public int price() {
    int money = 2700;
    return money;
  }

  public void note() { // non-static 메소드
    String title = book();
    int pay = price();
    System.out.println("책제목= " + title);
    System.out.println("책제목= " + book() );
    System.out.println("책가격= " + price() );
    System.out.println("책가격= " + pay );
  }
}
