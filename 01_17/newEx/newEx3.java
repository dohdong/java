package newEx;

public class newEx3  {

	public static void main(String[] args) {
		System.out.println("=== 나르시스트의 수 ===");
		int count = 0;

		for(int i=100;i<1000;i++) { 
			int h = i/100;
			int t = (i%100)/10;
			int o = i%10;     // 하.. 이거 하나때문에... 하... 
			if (i ==(h*h*h+t*t*t+o*o*o)) {
				System.out.println("\t"+i);
				count++;
			}
		}
		System.out.println(count);
	}
} 

//class newEx3{
//	  public static void main(String args[]){
//	     System.out.println("=== 나르시스트의 수 ===");
//	      int count=0;
//	     for(int i=100;i<1000;i++){
//	        int h = i/100;
//	        int t = (i%100)/10;
//	        int o = i%10;
//	        if(i == (h*h*h+t*t*t+o*o*o)){
//	           System.out.println("\t"+i);
//	           count++;
//	        }
//	       }
//	    System.out.println("나르시스트 수 총 개수는 "+ count+"입니다.");
//	}
//	}
