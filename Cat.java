public class Cat{
	
	String name;
	
	public Cat(){}
	
	public Cat(String name){
		setName(name);
	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void doBite(Cat c){
		c.doBitten(this);
	}
	
	public void doBitten(Cat c){
		System.out.println(getName() + " Moew! It was bitten by" + c.getName());
	}
}
