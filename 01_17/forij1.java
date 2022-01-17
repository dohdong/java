
public class forij1  {

	public static void main(String[] args) {
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if (j==1) continue;
				System.out.println("i="+i+",j="+j);

			}
			
		}
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if (j==1) break;
				System.out.println("2. i="+i+",j="+j);

			}
			
		}
		a1: //label
		for(int i=0;i<3;i++){
		//a2 : //label
			for(int j=0;j<3;j++){
				if (j==1) break a1; 
			       System.out.println("  3. i="+i+",j="+j);
			   }
			}

	}
}
