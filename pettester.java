public class PetTester{
	public static void main(String[] args){
	dogBiter d1 = new dogBiter("Snoopy");
	dogBiter d1 = new dogBiter("Pluto");
	
	d1.doBite(d2);
	d2.doBite(d1);
	

	Cat c1 = new Cat("Tom");
	Cat c2 = new Cat("Jerry");
	
	c1.doBite(c2);
	c2.doBite(c1);
	
	c1.doBite(d2);
	d1.doBite(c1);
	
	Bird b1 = new Bird("Big bird");
	Bird b2 = new Bird("Tweety");
	
	b1.doBite(b2);
	b2.doBite(b1);
	
	b1.doBite(c2);
	d1.doBite(b1);
	
	Rock r = new Rock("Rocky");
	
	r.doBite(d1);
	c1.doBite(r);
	d1.doBite(r);
	}
}