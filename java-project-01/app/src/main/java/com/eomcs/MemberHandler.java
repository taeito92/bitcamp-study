package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {

  static class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();


  // 생성자를 2개 만들면 둘중에 원하는 것으로 선택해서 사용가능
  // 예를들어 app에서 MemberHandler memberHandler = new MemberHandler(keyScan);
  // or MemberHandler memberHandler = new MemberHandler("관리자", keyScan);
  MemberHandler(Scanner keyScan) {
    this.keyScan = keyScan;
    this.memberGroupName = "일반";
  }

  MemberHandler(String memberGroupName, Scanner keyScan) {
    this.memberGroupName = memberGroupName;
    this.keyScan = keyScan;
  }

  public void execute() {
    System.out.println("[회원 관리]");

    loop: while(true) {
      //인스턴스 메서드에서 인스턴스 변수를 사용할 때
      //this를 생략할 수 있다.
      System.out.print(/*this.*/memberGroupName+"/회원 관리> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": list(); break;
        case "add": add(); break;
        case "update": update();  break;
        case "delete": delete(); break;
        case "view": view(); break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }

  void add() {
    System.out.println("[회원 등록]");

    if(memberList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더이상 게시글을 추가할 수 없습니다.");
      return;
    }

    Member member = new Member();

    System.out.print("이름: ");
    member.name = keyScan.nextLine();

    System.out.print("이메일: ");
    member.email = keyScan.nextLine();

    System.out.print("비밀번호: ");
    member.password = keyScan.nextLine();

    System.out.print("재직여부: (y/N) ");
    if(keyScan.nextLine().equals("y")) {
      member.working = true;
    } else {
      member.working = false;
    }

    member.registeredDate = new Date();

    memberList.append(member);

    System.out.println("회원을 등록했습니다.");


  }

  void list() {
    System.out.println("[회원 목록]");

    Object[] arr = memberList.toArray();

    for (int i = 0; i < arr.length; i++) {
      Member member = (Member) arr[i];
      System.out.printf("%d, %s, %s, %b\n",
          i, 
          member.name,
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),
          member.working);
    }
  }

  void view() {
    System.out.println("[회원 조회]");
    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());
    if(index > 0 && index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }
    Member member = (Member) memberList.retrieve(index);
    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td\n", member.registeredDate);
    System.out.printf("재직중: %s\n", member.working ? "예" : "아니오");
  }

  void update() {
    System.out.println("[회원 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if(index > 0 && index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    //멤버리스트에 가면 배열이 있고 그 곳에 인덱스 번째의 배열에 뭐가 있는지 가져오세요.

    System.out.printf("이름(%s)? ", member.name);
    String name = keyScan.nextLine();

    System.out.printf("이메일(%s) ", member.email);
    String email = keyScan.nextLine();

    System.out.printf("암호");
    String password = keyScan.nextLine();

    System.out.printf("재직중(%s)? (y,N) ", member.working ? "예" : "아니오");
    boolean working = false;
    if (keyScan.nextLine().equals("y")) {
      working = true;
    }

    System.out.print("정말 변경하시겠습니다?(y/N) ");

    if(!keyScan.nextLine().equals("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    } 

    member.name = name;
    member.email = email;
    member.working = working;
    member.password = password;

    System.out.println("회원을 변경하였습니다.");

  }

  void delete() {
    System.out.println("[회원 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if(index > 0 && index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다");
      return; 
    }

    System.out.print("정말 삭제하시겠습니다?(y/N) ");

    if(!keyScan.nextLine().equals("y")) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    } 

    memberList.remove(index);

    System.out.println("회원을 삭제하였습니다.");
  }

}
