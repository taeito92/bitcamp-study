package com.eomcs.lang.ex04;


public class Test01 {
  public static void main(String[] args) {
    
    char c; // unicode 문자 코드(0~65535)를 저장하는 변수

    c = 0x0041; // A 문자에 해당하는 Unicode를 16진수로 표현하여 저장한다.
    System.out.println(c); 
    // c 변수에 저장된 문자 코드를 println()에 전달하면
    // println() 명령은 그 문자 코드의 해당하는 폰트를 찾아 화면에 출력한다.

    c = 0x41; // 숫자 앞의 00은 생략해도 된다.
    System.out.println(c); 

    c = 65; // A 문자의 유니코드를 10진수로 표현해도 된다.

    System.out.println(c); 

    c = '헐'; //한글 '헐'의 유니코드 값을 C 변수에 저장한 후 출력한다. 
    // 헐이라는 문자를 메모리에 저장하는 것이 아니라
    // 자바에서 헐이라는 문자에 해당하는 값(0xd5d0)을 찾아서 저장한다.
    System.out.println(c); 

    c = 0xd5d50;
    System.out.println(c);







  }
}
