package net.hb.day0701;

public interface AAA {
  public void apple();
  public String memo();
  public boolean nullCheck(int key);
  // 추상 메소드 구성원이라서 AAA인터페이스로 개체 생성하면 에러
  // AAA인터페이스 상속 안하면 객체화 확인

}
