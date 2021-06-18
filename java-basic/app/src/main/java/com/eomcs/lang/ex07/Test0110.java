package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Test0110 {

  static int p() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    return len;
  }

  static void printSpaces(int spaceLen) {
    int spaceCnt = 1;
    while (spaceCnt <= spaceLen) {
      System.out.print(" ");
      spaceCnt++;
    }

  }

  static void printStars(int starLen) {
    int starCnt = 1;
    while (starCnt <= starLen) {
      System.out.print(" ");
      starCnt++;
    }

    public static void main(String[] args) {
      int len = p();
      for(int starLen = 1; starLen <= len; starLen += 2) {
        printSpaces(spaceLen(len, starLen));
        printStars(starLen);
      }
      // 출력 줄 바꾸기
      System.out.println();
      starLen += 2;

    }

  }
}