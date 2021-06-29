package net.hb.day0629;

public class LottoUser {

  public static void main(String[] args) {

    int[] ret = Lotto.input(); //출력의 목적이 없음
    Lotto.output(ret); 

    Lotto lg = new Lotto();
    int value = lg.inputHap();
    System.out.println("숫자합계 = " + value);
    System.out.println("숫자합계 = " + lg.inputHap());
    System.out.println();
    System.out.println("LotteUser.java 11:00");
  }

}
