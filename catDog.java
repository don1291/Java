public class catDog{
	String name;
	public Cat(){}
	
	public Cat(String name){
		setName(name);
	}
	public Pet(String name){
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void doBite(Cat c){
		c.doBitten(this);
	}
	public void doBite(Dog d){
		d.doBitten(this);
	}
	public void doBitten(Cat c){
		System.out.println(getName() + "yelped, I was bitten!!!");
	}
	public void doBitten(Dog d){
		System.out.println(getName() + "yelped, I was bitten!!!");
	}
	
}