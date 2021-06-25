package com.eomcs;

import java.util.Scanner;

public class App {


  static Scanner keyScan = new Scanner(System.in);


  public static void main(String[] args) {

    // 규칙에 따라 만든 클래스에 대해
    // 규칙에서 정의한 메서드를 호출하려면
    // 먼저 그 클래스의 인스턴스를 생성한 후
    // 그 인스턴스를 이용하여 메서드를 호출해야 한다.
    BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
    BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);
    MemberHandler memberHandler = new MemberHandler(keyScan);
    ComputeHandler computeHandler = new ComputeHandler(keyScan);
    // 맴버핸들러에는 생성자가 2개가 있으므로 둘중에 원하는 방식 하나를 선택해서 작성
    // 지금은 키스캔 한개만 입력했으므로 생성자 2개중에 첫번째 것으로 작성됨

    menuLoop: while(true) {
      System.out.println("[메뉴]");
      System.out.println("1: 게시글 관리");
      System.out.println("2: 게시글 관리");
      System.out.println("3: 회원 관리");
      System.out.println("4: 계산기");
      System.out.print("메뉴를 선택하시오. (종료:quit) [1..4] ");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          boardHandler2.execute();
          break;
        case "3":
          memberHandler.execute();
          break;
        case "4":
          computeHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }

      System.out.println();
    }


    keyScan.close();
    System.out.println("안녕히 가세요!");
  }



}
