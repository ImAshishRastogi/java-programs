class AllMethod implements Cloneable{
	int x,y;
	AllMethod(){
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String...args) throws CloneNotSupportedException{
		AllMethod obj1=new AllMethod();
		System.out.println(obj1);
		AllMethod obj2=obj1;
		System.out.println(obj2);
		AllMethod obj3=(AllMethod)obj1.clone();
		System.out.println(obj3);
	}
}