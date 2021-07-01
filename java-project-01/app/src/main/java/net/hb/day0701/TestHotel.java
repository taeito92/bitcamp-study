package net.hb.day0701;

import java.util.Scanner;

public class TestHotel {
  // 생성자 클래스이름, 리턴값x, void기술x
  // 생성자 사용 new 키워드 다음에 기술 클래스 ob = new 클래스( )
  // 생성자는 중복가능, 기본 생성자는 생략가능
  // 맴버필드 = 전역변수 private
  private int floor; // 층 = 행 3층
  private int room; // 호 = 열 5호   3행 * 5열 = 15개의 방 구성
  private String[][] name = new String[3][5];
  private String title;


  public TestHotel() { }
  public TestHotel(String name) {
    System.out.println("     *** " + name + " *** ");
    System.out.println(name + " 방문을 환영합니다. ");
  }
  public TestHotel(String name, int year) { }

  public void process() {
    Scanner sc = new Scanner(System.in);
    int sel = 9;
    while(true) {
      System.out.println("\n1.투숙 2.퇴실 3.map 9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
        System.out.println("호텔 예약 프로그램을 종료합니다.");
        System.exit(1);
      }
      switch(sel) {

      }
    }
  }

  public void checkIn() {

  }

  public void checkOut() {

  }

  public void map() { // printAll() = list()

  }

  public void list() { // 

  }

  public static void main(String[] args) {
    TestHotel wh = new TestHotel();
    wh.process();

  }

}