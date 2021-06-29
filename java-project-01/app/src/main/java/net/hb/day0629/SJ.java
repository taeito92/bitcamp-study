package net.hb.day0629;

public class SJ {

  public int getTotal(String name, int kor, int eng) {
    System.out.println(name+"님의 성적");
    int hap = 0;
    hap = hap + kor + eng;
    return hap;
  }

  public double getMean(double sum) {
    double average = sum / 2;
    return average;
  }

  public char getGrade(double average) {
    char grade = 'f';
    switch((int)average/10) { //평균 데이터 점수 int 정수화
      case 10: 
      case 9: grade='A'; break; 
      case 8: grade='B'; break; 
      case 7: grade='C'; break; 
      case 6: grade='D'; break; 
      default:
        grade='F';
    }
    return grade;
  }
  public String result(double avg) {// 함수의 중복 = 오버로딩

    String rs = "재시험";
    if(avg >= 70) 
      rs = "축합격";
    else 
      rs = "재시험";

    return rs;
  }

  public String result(double avg, int kor, int eng) {// 함수의 중복 = 오버로딩

    String rs = "재시험";
    if(avg >= 70 && kor >= 60 && eng >= 60) 
      rs = "축합격";
    else 
      rs = "재시험";

    return rs;
  }


  //  합계를 구하는 함수
  //  평균을 구하는 함수
  //  학점을 구하는 함수
  //  합격여부를 구하는 함수
  // 평균 70점부터 합격 0~69 재시험

}
