public class DataTypeEx2 {
  public static void main(String[] args) { 
// public은 공공, static은 main메서드가 유일하게 하나라고 알려주는 의미. 
// void 는 리턴하는 값이 없으니까. void 라고 함. 여기까지가 키워드
// [] 가 의미하는건 배열. 
// main 은 반드시 public static void main 으로 해줘야함. 
    float f = 1.5f;
    System.out.println(f);
    double d = 1.5;
    System.out.println(d);
    double d2 = 1.5d;
    System.out.println(d2);
    d2 = 0.1253E5;   // 과학적표기방식 scientific notification
    System.out.println(d2);
    d2 = 0.1253E-5;   
    System.out.println(d2);

    String st = new String("Hello");
    System.out.println(st);
    System.out.println(st.length() );

    //String name = "박성빈";
    //System.out.println(name);
  }
}