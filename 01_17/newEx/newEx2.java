package newEx;
// �غ����ٰ� ����...��
//public class newEx2  {
//
//	public static void main(String[] args) {
//		int num,count;
//		int a =0, b=0;
//		int go;
//		int Gozip = 0;
//
//		for(num=10 ; num<=99; num++) { 
//			go = num;
//			count = 0;
//			int i;
//
//			for (i =0;i >10 ; i++) {
//				if (go <=9) {
//					if(count>=4) {
//						Gozip = go ;
//					}
//					break;
//				}
//				else {
//
//					
//					a = 0;
//					b = 0;
//					a = num %10;
//					b = num /10;
//					go = a * b;
//					count = count + 1;
//					continue;
//
//				}
//			}System.out.print(Gozip);
//
//		}
//		
//	} 
//}


public class newEx2 {
   public static void main(String args[]) {
       int total =0;
       for(int i=10;i<100;i++){
            int k = i;
            int count = 0;
            while(k>9){
                k=k/10*(k%10);
	   count++;
            }
            if(count >= 4){
                   System.out.println("���� "+i+"�� ������ "+ count+"�Դϴ�");
                   total++;
            }
       }//for end
   System.out.println(" 10~99������ ������ 4�̻��� �� ������ "+total+"�Դϴ�.");
 }//main end
}//class end

