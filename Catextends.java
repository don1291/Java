public class Cat extends Pet{
	String name;
	public Cat(){}
	public Cat(String name){
		setName(name);
}
public void setName(String name)
{
	this.name = name;
}
public String getName()
{
	return name;
}
public void doBite(Pet p)
{
	p.doBitten(this);
}
public void doBitten(Pet p)
{
	System.out.println(getName() + "yelped, I was bitten!!!" + p.getName());
}