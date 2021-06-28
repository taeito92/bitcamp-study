package net.hb.day0628;

import java.util.Scanner;


public class CampTest1 {
  static Scanner sc=new Scanner(System.in);
  boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
  int sel=9, num=0;

  CampTest1(Scanner sc1) {
    sc = sc1;
  }

  public static void main(String[] args) {

    System.out.println("1차원배열 캠프예매 28일 월요일 ");
    CampTest1 camptest1 = new CampTest1(sc);


    camptest1.list();

    while(true) {
      try {
        System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
        camptest1.sel = Integer.parseInt(sc.nextLine());

        if(camptest1.sel==9) {
          System.out.println("캠프장예약프로그램을 종료합니디");
          break;
        }

        switch(camptest1.sel) {
          case 1: 
            camptest1.input();
            break;
          case 2: //퇴실은 조별/개인별처리
            camptest1.output();
            break;
          case 3: //전체예약상태
            camptest1.list();//for end
            break;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;   
        }//switch end
      }catch (Exception e) {   }
    }//while 

    sc.close();
  }//end

  void input() {

    System.out.print("예약캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //고객이 5입력
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); 
    return;
    } else if(camp[num-1] == false) {
      camp[num-1] = true;
      System.out.println("예약이 완료 되었습니다.");
      for(int i=0; i<camp.length; i++) {
        if(camp[i]==true) {
          System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
        }else {
          System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
        }
      } return;
    } else {
      if(camp[num-1] == true) {
        System.out.println("예약을 하실 수 없습니다, 현재 사용중인 방입니다.");
      } 
      return;
    }

  }

  void output() {

    System.out.print("퇴실캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //3입력하면 
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); 
    return;
    } else if(camp[num-1] == false) {
      System.out.println("빈방입니다, 퇴실을 하실 수 없습니다.");
      for(int i=0; i<camp.length; i++) {
        if(camp[i]==true) {
          System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
        }else {
          System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
        }
      } return;
    } else {
      if(camp[num-1] == true) {
        camp[num-1] = false;
        System.out.println("퇴실을 완료했습니다.");
      } 
      return;
    }
  }
  void list() {

    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    }

  }
}//class END