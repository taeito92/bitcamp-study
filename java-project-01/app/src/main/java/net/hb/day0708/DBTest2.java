package net.hb.day0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest2 {
  Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
  Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
  ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
  String msg="isud=crud쿼리문기술";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  public void dbConnect() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("오라클 드라이브및 서버 연결성공");
      ST = CN.createStatement();
    }catch(Exception e) {System.out.println("error = "+e);}
  }

  public void dbInsert() {
    try {


    }catch(Exception e) {}
  }

  public void dbSelectAll() {
    try {
      ST = CN.createStatement(); // 이렇게 또 줘도 괜찮다
      msg = "select * from test";
      ResultSet rs = ST.executeQuery(msg);
      while(rs.next() == true) {
        int a = rs.getInt("code");
        String b = rs.getString("name");
        String c = rs.getString("title");
        System.out.println(a+"\t"+b+"\t"+c);
      }
      rs.close();
    }catch(Exception e) {}
  }

  public void dbDelete() {
    try {
      System.out.println("삭제할 이름 입력>>>");
      String del = sc.nextLine();
      msg ="delete from test where name = '"+ del+"'" ;
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(del + "데이터 삭제 성공");
      }else {System.out.println("삭제 실패");}

    }catch(Exception e) {}
  }





  public static void main(String[] args) {


    try {  
      DBTest2 bbs = new DBTest2();
      bbs.dbConnect();
      bbs.dbSelectAll();


    }catch(Exception ex) { System.out.println("에러이유 " + ex);}  
  }//main end

  //신규등록,전체출력성공후 메소드생성해서 최대한 메소드활용    
  //본인작성한 코드는 복사후 붙여넣기 주석처리 

}//class END
