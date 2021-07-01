package net.hb.day0630;

import java.util.Scanner;

public class Work05Hotel {
  // 생성자 클래스이름, 리턴값x, void기술x
  // 생성자 사용 new 키워드 다음에 기술 클래스 ob = new 클래스( )
  // 생성자는 중복가능, 기본 생성자는 생략가능
  // 맴버필드 = 전역변수 private
  private int floor; // 층 = 행 3층
  private int room; // 호 = 열 5호   3행 * 5열 = 15개의 방 구성
  private String[][] name = new String[3][5];

  private String guest;
  Scanner sc = new Scanner(System.in);


  public Work05Hotel() { }
  public Work05Hotel(String name) {
    System.out.println("     *** " + name + " *** ");
    System.out.println(name + " 방문을 환영합니다. ");
  }
  public Work05Hotel(String name, int year) { }

  public void process() {

    int sel = 9;
    while(true) {
      System.out.println("\n1.투숙 2.퇴실 3.map 9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
        System.out.println("호텔 예약 프로그램을 종료합니다.");
        System.exit(1);
      }
      switch(sel) {
        case 1: 
          checkIn();
          break;
        case 2:
          checkOut();
          break;
        case 3:
          map();
          break;
      }
    }
  }

  public void checkIn() {
    System.out.println("몇층에 투숙>> ");
    floor = sc.nextInt();
    System.out.println("몇호에 투숙>> ");
    room = sc.nextInt();
    sc.nextLine();
    System.out.println("이름을 입력하세요>> ");
    guest = sc.nextLine();
    name[floor-1][room-1] = guest;
    System.out.println(guest+"님"+floor+"0"+room+"호에 예약되었습니다");
  }

  public void checkOut() {

    System.out.println("이름을 입력해 주세요>> ");
    String id = sc.nextLine();
    for(int i=0; i<3; i++) {
      for(int a=0; a<5; a++) {
        if(this.name[i][a].equals(id)) {
          this.name[i][a] = null;
          System.out.println("퇴실완료");
          break;
        } 

      }
    }
  }






  public void map() { // printAll() = list()
    System.out.println("\n\t [ 호텔투숙상태 ]");
    for(int i=0; i<3; i++) {
      for(int a=0; a<5; a++) {
        System.out.print((i+1)+"0"+(a+1)+"\t");
      }
      System.out.println();

      for(int j=0; j<5; j++) {
        if(this.name[i][j] == null) {
          System.out.print("\t");
          continue;
        }
        System.out.print(this.name[i][j]+"\t");
      }
      System.out.println("\n---------------------------------------------------------");
    }
  }

  public void list() { // 

  }

  public static void main(String[] args) { 
    Work05Hotel wh = new Work05Hotel();

    wh.process();

  }

}
