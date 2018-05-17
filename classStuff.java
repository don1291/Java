public class ClassStuff{
    
		String name;
		int age;
		
		public ClassStuff(){}
		
		public ClassStuff(String name){
		    this.name = name;
		}
		
		public void setName(String name){
		    
			this.name = name;
		}
		
		public String getName(){
		    return name;
		}
		public void setAge(int age){
			this.age = age;
		}
		public int setAge(){
			return age;
		}
		
		public static void main (String[] args){
		    ClassStuff cs = new ClassStuff("John" , 20);
		    
		    System.out.println(cs.getName() + "," + cs.getAge());
		}
	}
	