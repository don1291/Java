public class catpet{
	public static void main(String[] args){
	Cat c1 = new Cat("Tom");
	Cat c2 = new Cat("Jerry");
	
	c1.doBite(c2);
	c2.doBite(c1);
	}
}