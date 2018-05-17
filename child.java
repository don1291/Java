public class Child extends Parent{
	public Child(String name){
	    super(name);
	}
	
	public int addTwo(int x , int y){
	    return x + y;
	}
	
	public String sayHello(){
	    return "hello: " + getName();
	}
	
	public static void main(String[] args){
	
		Child c = new Child("Larry");
		
		System.out.println(c.getName());
		
		System.out.println(c.addTwo(5,7));
	}





}