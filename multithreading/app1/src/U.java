class U 
{
	public static void main(String[] args) 
	{
Thread t1 = Thread.currentThread();
System.out.println(t1.is Daemon());
t1.setDaemon(true);
System.out.println(t1.isDaemon());
	}
}
//we cannot able to convert the ,main thread to  daemon thread we get illegal exception