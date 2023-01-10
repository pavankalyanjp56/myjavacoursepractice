class T 
{
	public static void main(String[] args) 
	{
Thread t1 = Thread.currentThread();
System.out.println(t1.getName());
System.out.println("before calling the setName method");
t1.setName("new name for main thread");
System.out.println("before calling the setName method");
System.out.println(t1.getName());
//can i change the name after main thread  ans::" yes" every thread can change including main method also
	}
}
