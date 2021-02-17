class Temp
{
	static int x;
	public String toString(){
		return this.getClass().getSimpleName(); //return class name
	}
	public static void main(String...args){
		Temp obj1=new Temp();
		//Temp obj2=new Temp();
		System.out.println(obj1);
		/*obj1.x=1;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		obj1.x=2;
		System.out.println(obj1.x);
		System.out.println(obj2.x);*/
	}
}