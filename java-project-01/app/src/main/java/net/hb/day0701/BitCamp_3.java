package net.hb.day0701;

public class BitCamp_3 { 

  // 값을 숨기기위해 기본 생성자에 생성자를 호출 후 메인에서 기본 생성자를 호출
  public BitCamp_3() { this("종로점", 7, "python"); } // 기본 생성자는 생략가능, 
  public BitCamp_3(String location) { } // String 타입의 매개인자가 있는 생성자
  public BitCamp_3(int floor) { } // int 타입의 매개인자가 있는 생성자
  public BitCamp_3(String location, int pos, String subject) {
    System.out.println(location +"지점 "+ pos + "층 "+ subject + "과정입니다");
  } 


  public static void main(String[] args) { 

    BitCamp_3 bc = new BitCamp_3(); 
    bc.coffee();


  }

  public void coffee() { // non static
    System.out.println("coffee 맥심카누");
    this.cookie(); // this 키워드 생략가능, nonstaic 사이에 호출가능
  }

  public void cookie() { // non static
    System.out.println("cookie 버터링");
  }

}
