package com.eomcs.lang.ex04.assignment;

public class Test001 {

  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    System.out.print("이름? ");
    String name = keyScan.nextLine();

    System.out.print("국어? ");
    int kor = keyScan.nextInt();

    System.out.print("영어? ");
    int eng = keyScan.nextInt();

    System.out.print("수학? ");
    int math = keyScan.nextInt();

    int sum = kor+eng+math;
    float avg = (kor+eng+math) / 3;

    System.out.println("-----------------------------");
    System.out.print(name);
    System.out.print(" ");
    System.out.print(kor);
    System.out.print(" ");
    System.out.print(eng);
    System.out.print(" ");
    System.out.print(math);
    System.out.print(" ");
    System.out.print(sum);
    System.out.print(" ");
    System.out.print(avg);



  }

}
