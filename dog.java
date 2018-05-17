public class Dog{
	
	String name;
	
	public Dog(){
	}
	
	public Dog(String name){
		setName(name);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void doBite(Dog d){
		d.doBitten(this);
	}
	
	public void doBite(Dog d){
		System.out.println("Yelp! I was bitten!!!" + d.getName());
	}
	
	
	
}