package net.hb.day0630;

public class TestBook {

  public int m = 78;

  public static void main(String[] args) {
    char a= 'A', b = '1', c = 90;
    System.out.println(a + "\t" + b + "\t" + c);
    System.out.println();

    int x = a;
    int y = b;
    int z = c;

    System.out.println(x + "\t" + y + "\t" + z);
    System.out.println();

    new TestBook().note(); // 익명의 객체 ( TestBook tb = new TestBook();를 생략한 것 

  }


  public void note() { // non-static 메소드
    int m = 24;
    System.out.println("지역변수 책가격= " + m);
    // 스테틱 안에서는 this를 사용 못한다.
    System.out.println("전역변수 책가격= " + this.m); 
  }
}
