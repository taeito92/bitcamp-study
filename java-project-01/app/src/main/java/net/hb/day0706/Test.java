package net.hb.day0706;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String msg = "";

    System.out.print("사번입력>>");
    int a = Integer.parseInt(sc.nextLine());

    System.out.print("이름입력>>");
    String b = sc.nextLine(); 

    System.out.print("부서이름입력>>");
    String c = sc.nextLine(); 
    sc.close();
    //    msg = "insert into insa(sabun,name,buse) values(%d,'%s','%s')";
    //    msg = String.format(msg, a,b,c);
    msg = " insert into insa(sabun,name,buse) values("+a+",'"+b+"','"+c+"')";
    System.out.println(msg);
    // 출력 insert into insa(sabun,name,buse) values(3345, 'kim' '전산')
  }

}
