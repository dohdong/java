public class DataTypeEx2 {
  public static void main(String[] args) { 
// public�� ����, static�� main�޼��尡 �����ϰ� �ϳ���� �˷��ִ� �ǹ�. 
// void �� �����ϴ� ���� �����ϱ�. void ��� ��. ��������� Ű����
// [] �� �ǹ��ϴ°� �迭. 
// main �� �ݵ�� public static void main ���� �������. 
    float f = 1.5f;
    System.out.println(f);
    double d = 1.5;
    System.out.println(d);
    double d2 = 1.5d;
    System.out.println(d2);
    d2 = 0.1253E5;   // ������ǥ���� scientific notification
    System.out.println(d2);
    d2 = 0.1253E-5;   
    System.out.println(d2);

    String st = new String("Hello");
    System.out.println(st);
    System.out.println(st.length() );

    //String name = "�ڼ���";
    //System.out.println(name);
  }
}