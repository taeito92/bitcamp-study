package net.hb.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {
  Connection CN = null; // db서버 연결정보 서버ip주소 계정ip,pwd
  Statement ST = null; // ST=CN.createStatement() 명령어생성 삭제,신규등록,조회하라
  ResultSet RS = null; // select 조회결과 값 전체 데이터를 기억합니다.
  String msg = "isud=crud쿼리문기술";
  Scanner sc = new Scanner(System.in);
  int Gtotal = 0; // 조회갯수72 /  전체갯수349 전체갯수 = gtotal


  public static void main(String[] args) {

    DBTest dt = new DBTest();

    dt.dbq();
    dt.sc.close();


  }

  public void ins() {
    try {
      // 두번째 키보드에서 데이터를 입력
      int a = -1;
      while(a>10000 || a < 0) {
        System.out.print("\n코드입력(4자릿수)>>>"); 
        a = Integer.parseInt(sc.nextLine());
        if (a>10000 || a < 0)
          System.out.println("다시입력하세요");
      }
      System.out.print("이름입력>>>"); 
      String b = sc.nextLine();
      System.out.print("제목입력>>>"); 
      String c = sc.nextLine();

      // 3번째 쿼리문 완성
      msg = "insert into test(code,name,title,wdate,cnt) values("+a+", '"+b+"', '"+c+"', sysdate, 0)";
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a+" 코드 데이터 저장성공했습니다.");
      } else {System.out.println(a+" 코드 데이터 저장 실패했습니다.");}
    } catch(Exception ex) { }


  }

  public void selec() {

    try {
      msg = "select count(*) as hit from test";
      RS = ST.executeQuery(msg);
      if(RS.next() == true) {Gtotal = RS.getInt("hit"); }

      System.out.println("프로그램 전체 데이터를 읽어오는중... 잠시 기다려 주세요");
      Thread.sleep(1000);
      msg = "select * from test"; // 문자열을 명령어로 인식해서 실행 하도록 Statement
      RS = ST.executeQuery(msg);
      System.out.println();
      System.out.println("----------------- 데이터 출력 -----------------");
      System.out.println("\t\t\t\t전체레코드갯수: " + Gtotal);
      System.out.println("코 드\t이 름\t제 목\t날 짜\t\t조회수");
      while(RS.next() == true) {
        // 필드에 접근해서 데이터를 가져올때 getxxx()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        java.util.Date udt = RS.getDate("wdate");
        String utitle = RS.getString("title");
        String ucnt = RS.getString("cnt");
        System.out.println(ucode +"\t" + uname+"\t" + utitle+"\t" + udt+"\t" + ucnt);
      }
    } catch(Exception ex) { }

  }

  public void dbq() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이브 로드 
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      CN = DriverManager.getConnection(url, "system", "1234");
      System.out.println("오라클 계정 비번 드라이버 연결성공10:19");
      ST = CN.createStatement();  // 첫번째 명령어 생성

    } catch(Exception ex) { }

    int sel = 9;
    while(true) {
      System.out.println("\n1.데이터입력 2.조회 9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());
      if(sel == 9) {
        System.out.println("종료합니다.");
        System.exit(1);
      }
      switch(sel) {
        case 1: 
          ins();
          break;
        case 2:
          selec();
          break;
        default:
          System.out.println("잘못된 번호를 입력하셨습니다.");
      }
    }
  }
}