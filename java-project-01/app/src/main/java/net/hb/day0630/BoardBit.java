package net.hb.day0630;

public class BoardBit implements BoardImp{

  public static void main(String[] args) {

  }

  @Override
  public int boardCount() {

    return 0;
  }

  @Override
  public boolean boardInsert() {

    return false;
  }
  // 오버라이드는 생략가능
  @Override
  public void boardDelete(int num) {

  }
  // @Override라고 쓰게되면 오류가 나온다 - 자식 클래스가 가져와서 재정의 했다는 뜻
  public void index() {
    //인터페이스꺼 소속아님, 상속x, 재정의대상x
  }

}
