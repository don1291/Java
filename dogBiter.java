public class dogBiter implements Biter{
	String name;
	public dogBiter(){}
	public dogBiter(String name){
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
public void doBite(Biter b)
{
	b.doBitten(this);
}
public void doBitten(Biter b)
{
	System.out.println(getName() + "yelped, I was bitten!!!" + b.getName());
}

}