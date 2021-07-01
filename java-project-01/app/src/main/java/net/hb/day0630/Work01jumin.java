package net.hb.day0630;

public class Work01jumin {

  public static void main(String[] args) {
    String min = "871024-1541965";
    String min1 = "871024";
    String min2 = "1541965";

    // 문제1 총자릿수 6 -7 13자릿수, 14자릿수
    int sum = 0;

    int first = min1.length();
    int second = min2.length();
    sum = first + second;

    System.out.println("총자릿수는? "+sum+"자릿수");



    // 문제2 ******-1541965
    String data = min.substring(min.indexOf("-")+1);
    System.out.println("******-"+data);


    // 문제3 1/3 남자 2/4여자 switch
    char gender = min2.charAt(0);

    switch (gender) {
      case '1':
      case '3':
        System.out.println("남자입니다");
        break;
      case '2':
      case '4':
        System.out.println("여자입니다");
        break;
      default:
        System.out.println("잘못 입력 하셨습니다.");
    }




    // length(),substring(),indexOf(),charAt()
  }


}
