package net.hb.day0630;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp {

  public static void main(String[] args) {

    // java.util 패키지 Scanner 생성자 3번째(InputStream)
    InputStream is = System.in; //static InputStream in필드 표준
    Scanner sc = new Scanner(is);
    int sabun = 0;
    String name = null;


    //문제 키보드입력 Scanner클래스 반드시 입력해서 출력, 반복문, 예외처리, 형변환
    while(true) {
      try {

        System.out.print("\n사번입력>> ");
        sabun = Integer.parseInt(sc.nextLine()); //숫자,문자 다 입력해서 단점 해결
        System.out.print("이름입력>> ");
        name = sc.nextLine();
        if(name.equals("") || name.equals(null)) {
          System.out.println("이름 데이터를 정확히 입력하세요");
          continue;
        }
        break;
      } catch (Exception e) {} 
    }
    System.out.println();
    System.out.println("사번 = " + sabun);
    System.out.println("이름 = " + name);
    sc.close();


  }

}
