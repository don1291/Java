public class Parent{
	String name;
	
	public Parent(){}
	public Parent(String name){
		setName = (name);
	}
	
	public void setName(String name){
		this.name = name;
	
	}
	public String getName(){
		return name;
	}
	public String sayHello(){
		return "hello"
	public static void main(String[]args){
		   Parent p = new Parent();
		   p.setName("Harry");
		   System.out.println(p.name);

	}
}