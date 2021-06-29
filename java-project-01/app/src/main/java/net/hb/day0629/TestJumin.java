package net.hb.day0629;

public class TestJumin {

  public static void main(String[] args) {
    String min = "871024-15419465";

    char a = min.charAt(7);
    System.out.println(a);

    switch (a) {
      case '1':
        System.out.println("남자입니다");
        break;
      case '2':
        System.out.println("여자입니다");
        break;
      default:
        System.out.println("잘못 입력 하셨습니다.");
    }   

  }


}
