class Q 
{
	public static void main(String[] args) 
	{
Thread t1 = Thread.currentThread();
System.out.println(t1.getName());
System.out.println(t1.isDaemon());
System.out.println(t1.getId());// whatever the thread is having a unique type as long as long type ---> ID we cannot able to modify.
System.out.println(t1.getPriority());//each and every thread having a min priority Range is (1-10)
	}
}
/*
--->  daemon thread is a thread which is defending on the parent thread.
----> when the parent thread is leaving from the execution then daemon thread also leaving
----> even though daemon thread having some excution.
----> the opposite of the daemon thread is user thread 
.....->by default in java we get user threads 
-----> any thread can be coverted to daemon thread before calling the start method
---> Main thread is not Daemon thread. "IMP"
its is alreay  call it by a jvm we cannot make it has a main thread to daemon

*/