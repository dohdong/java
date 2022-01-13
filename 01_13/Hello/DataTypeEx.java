public class DataTypeEx {
  public static void main(String[] args) { 
    boolean flag = true;   //타입변수 = 초기값;
    System.out.println(flag);
    byte b = 127;
    System.out.println(b);

    // b = b + 1;
    short s = 128 ; 
    System.out.println(s);

    // s = b + 1; 
    // short 가 byte 보다 큰 범위인데 int 로는 안된다..? 정도라고 하신듯.

    int num = b + 1;
    System.out.println(num);
    num  = 99;
    System.out.println(num);
    num  = 077;   // 8진수 Octal // 출력은 10진수로 출력이 됨. 99
    System.out.println(num);
    num  = 0xff;   // 16진수 Hex // 출력은 10진수로 출력이 됨. 63
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