public class DataTypeEx {
  public static void main(String[] args) { 
    boolean flag = true;   //Ÿ�Ժ��� = �ʱⰪ;
    System.out.println(flag);
    byte b = 127;
    System.out.println(b);

    // b = b + 1;
    short s = 128 ; 
    System.out.println(s);

    // s = b + 1; 
    // short �� byte ���� ū �����ε� int �δ� �ȵȴ�..? ������� �Ͻŵ�.

    int num = b + 1;
    System.out.println(num);
    num  = 99;
    System.out.println(num);
    num  = 077;   // 8���� Octal // ����� 10������ ����� ��. 99
    System.out.println(num);
    num  = 0xff;   // 16���� Hex // ����� 10������ ����� ��. 63
    System.out.println(num);
    long num2 = 2147483648L; 
    System.out.println(num2);
    char ch = 'A';
    System.out.println(ch);
    ch = 97;
    System.out.println(ch);
    ch = '\u0059';
    System.out.println(ch);
    ch = 0x59;
    System.out.println(ch);



  }
}