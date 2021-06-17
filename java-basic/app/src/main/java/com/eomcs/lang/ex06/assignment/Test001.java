package com.eomcs.lang.ex06.assignment;

import java.util.Scanner;

public class Test001 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("밑변의 길이를 입력하세요");
    int bottom = keyboard.nextInt();
    int a = 1;

    while(a<=bottom) {
      int b = 1;
      while(b<=a) {
        System.out.print("*");
        b++;
      }
      System.out.println();
      a++;

    }
  }

}
