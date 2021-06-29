package net.hb.day0629;

public class SJUser {

  public static void main(String[] args) {
    SJ sj = new SJ();

    String id = "LEE";
    int first = 90;
    int second = 50;

    int hap = sj.getTotal(id, first, second);
    double avg = sj.getMean(hap);
    char grade = sj.getGrade(avg);
    //합격조건 평균 70점부터, 과목별 60점부터
    // 함수의 중복 = 오버로딩
    String info = sj.result(avg, first, second);



    System.out.println("합계= " + hap);
    System.out.println("평균= " + avg);
    System.out.println("학점= " + grade);
    System.out.println("결과= " + info);
  }

}
