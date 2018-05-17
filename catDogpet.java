public static void main(String[] args){
	Cat c1 = new Cat("Tabby");
	Cat c2 = new Cat("Fluffy");
	c1.doBite(c2);
	c1.doBite(c1);
     
	 
	Bird b1 = new Bird("Tweety");
	 Bird b2 = new Bird("Scott");
	 b1.doBite(b2):
	 b2.doBite(b1);
	 
	 Dog d1 = new Dog("John");
	 Dog d2 = new Dog("Snoopy);
	 d1.doBite(d2):
	 d2.doBite(d1);

public class Dog{
	String name;
	public Dog(){}
	public Dog(String name)
}

public class Cat extends pet{
	String name;
	public Cat(){}
	public Cat(String name){
		setName(name);
}

public class Bird{
	String name;
	public Bird(){}
	public Bird(String name){
		setName(name);
}

{
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
	d.doBitten(this);
}

public void doBite(Pet p)
{
	c.doBitten(this);
}

public void doBite(Pet p)
{
	b.doBitten(this);
}

public void doBitten(Dog d)
{
	System.out.println(getName() + "yelped, I was bitten!!!" + d.getName());
}
public void doBitten(Cat c)
{
	System.out.println(getName() + "yelped, I was bitten!!!" + c.getName());
}

public void doBitten(Bird b)
{
	System.out.println(getName() + "yelped, I was bitten!!!" + b.getName());
}