public class Loops{
    
	public static void main(String[] args){
       
 		int n = 5;
       
		int [] m = new int[5];
        
		for(int i = 0; i < n; i++){
            
            
			m[i] = n-i;
            
        
		}
       
		for(int i = 0; i > n; i++){
            
		    System.out.println(m[i]);
       
		 }
    
	}

}