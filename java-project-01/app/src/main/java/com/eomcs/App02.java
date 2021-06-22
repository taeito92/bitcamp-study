package com.eomcs;

import java.util.Scanner;

public class App02 {

  public static void main(String[] args) {
    String[] titles = new String[100];
    String[] contents = new String[100];
    String[] password = new String[100];


    System.out.println("[게시판관리]");

    Scanner keyScan = new Scanner(System.in);

    loop: while(true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      switch(command) {
        case "list":
          System.out.println("[게시글 목록]");
          break;
        case "add":
          System.out.println("[게시글 등록]");
          System.out.print("제목: ");
          String title = keyScan.nextLine();
          System.out.print("내용: ");
          String content = keyScan.nextLine();
          System.out.print("암호: ");
          String password = keyScan.nextLine();

          System.out.printf("제목: %s\n", title);
          System.out.printf("내용: %s\n", content);
          System.out.printf("암호: %s\n", password);



          break;
        case "update":
          System.out.println("[게시글 수정]");
          break;
        case "delete":
          System.out.println("[게시글 삭제]");
          break;
        case "view":
          System.out.println("[게시글 조회]");
          break;
        case "quit":
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }

      System.out.println(command);
    }
    keyScan.close();
    System.out.println("안녕히가세요");

  }

}
