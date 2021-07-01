package net.hb.day0629;

public class TestJumin {

  public static void main(String[] args) {
    //java.lang 패키지 String 클래스의 메소드 char charAt(int)
    //java.lang 패키지 String 클래스의 메소드 int indexOf(int/String)
    //java.lang 패키지 String 클래스의 메소드 String substring(1시작,2끝-1)
    String min = "871024-1541965";
    int pos = min.indexOf("-");
    System.out.println("post= " + pos);
    String month = min.substring(2,4);
    String day = min.substring(4,6);
    System.out.println(month+"월"+day+"일 생일이네요");

    String last = min.substring(7);
    System.out.println(last);

    int len = min.length();
    System.out.println("총자릿수 =" + len);


  }
}



/*
 * public class TestJumin {

  public static void main(String[] args) {
    String min = "871024-15419465";

    char gender = min.charAt(7);
    System.out.println(gender);

    switch (gender) {
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
 */
