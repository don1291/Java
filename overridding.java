class Overridden{
    
    String message;

    public Overridden(){message = "Overridden";}
    
	public Overridden(String message){
	    
	    this.message = message;
	}
	
	public void doSomething(){
		System.out.println(message);
	}



}


class Overridding extends Overridden{

    public void doSomething(){
        System.out.println("");
        super.doSomething();
    }
    


}

public class Tester{
	public static void main(String[] args){
	
		Overridding or = new Overridding();
		or.doSomething();
	}
}