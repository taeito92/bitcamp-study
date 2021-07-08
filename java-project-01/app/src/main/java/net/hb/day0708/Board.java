package net.hb.day0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Board { //test 테이블


  public static void main(String[] args) {
    // 첫번째 오라클 db드라이버를 로드하는 명령어 Class.forName(" ")
    // 두번째 db서버 접근 계정명, pwd      127.0.0.1:152:XE system 1234
    // 세번째 명령어 생성은 두번째 서버정보를 참조해서 명령어를 생성 Statement ST =
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","1234");
      System.out.println("db연결성공 4:05");

      String sql = "select * from test" ;
      // 네번째 명령어 생성후, 명령어 실행() 결과값을 resultset 기억
      Statement stat = conn.createStatement();
      ResultSet rs = stat.executeQuery(sql);
      // 다섯번째 레코드를 첫번째부터 차례차례 이동하면서 출력 while(??) {코드,이름}
    }catch (Exception e) {System.out.print("error = " + e);}

  }// main end

}// board class end
