package forDim;
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 


public class forDim2  {

	public static void main(String[] args) {
		for (int i = 1; i<6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");


			}
			
			System.out.println("") ;
			
		}
	}
}

/*
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 

  * * * * * 
    * * * * 
      * * * 
        * * 
          * 

for(int r=0;r<5;r++){
    for(int c=0;c<5-r;c++){
         System.out.print ("  ");
    }
    for(int c=0;c<r+1;c++){
         System.out.print ("* ");
    }		    		    
    System.out.println();		    
    }

System.out.println();

for(int r=0;r<5;r++){	
     for(int c=0;c<r+1 ;c++){
    	System.out.print ("  ");
    }
    for(int c=0;c<5-r;c++){
    	System.out.print ("* ");
    }	    	    		    
    System.out.println();		    
    }


      }//main end
}//class end
*/