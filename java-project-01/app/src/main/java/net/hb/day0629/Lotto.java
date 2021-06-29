package net.hb.day0629;

public class Lotto { // 메인 클래스가 없어서 단독실행 불가

  public static int[] input() {

    int[] su = new int[6]; // su배열 지역배열로 사용
    su[0] = 3; su[1] = 5; su[2] = 1; 
    su[3] = 2; su[4] = 9; su[5] = 3;

    return su;

  }

  public int inputHap() { // non-static
    int hap = 0;
    int[] su = new int[6]; 
    su[0] = 3; su[1] = 5; su[2] = 1; 
    su[3] = 2; su[4] = 9; su[5] = 4;

    for(int i = 0; i < su.length; i++) {
      hap += su[i];
    }

    return hap;

  }

  public static void output(int[] a) { //괄호 안에는 밖에서 사용할때 들어 올 값의 형태
    for(int i = 0; i<a.length; i++) {
      System.out.print(a[i] + "\t");
    }
    System.out.println("\n로또배열 출력 성공했습니다");
  }


}
