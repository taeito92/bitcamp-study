package net.hb.day0630;

import java.io.InputStream;

public class Work03gugudan {

  public static void main(String[] args) throws Exception{

    // 자바에서 표준입력 ascii코드 byte형태
    // 자바에서 표준입력 system.in 키보드입력

    InputStream is = System.in; //static InputStream in필드 표준

    System.out.println("단입력>> ");
    int dan = is.read();
    for(int a=1; a<10; a++) {
      System.out.println(dan+'*'+a+"="+(dan*a));
    }
  }

}

