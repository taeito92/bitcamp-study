package net.hb.day0630;

public class Child extends Father {



  public static void main(String[] args) {
    // 모든 클래스 최상위 Object클래스 상속을 받는다.
    Child cd = new Child();
    Father ob = new Child();
    Father ff = new Father();
    // 상속을 받으면 부모 클래스에서 가져와서 쓸 수 있지만
    // 스테틱인지 넌스테틱인지는 구분해야한다.
    int a = cd.bank(); // 넌스테틱이므로 cd.(상속을 받았으므로 차일드로 가능)
    cd.book();
    cd.car();
    ob.car();
    ff.car();
  }

  public void book() {
    int m = bank();
    this.car();
    super.car();
  }
  @Override
  public void car() {
    System.out.println("Child클래스 car메소드");
  }

}
