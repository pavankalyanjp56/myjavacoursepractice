class F implements Runnable
{
@Override 
public void run()
{
for (int i = 1;i <= 100 ;i++ )
{
System.out.println("first child:" +i);
}
}
}
class G implements Runnable
{
@Override 
public void run()
{
for (int i = 1;i <= 100 ;i++ )
{
System.out.println(" second babe:" +i);
}
}
}
class H 
{
	public static void main(String[] args) 
	{
F f1 = new F();
Thread t1 = new Thread(f1);
t1.start();

 G g1 = new G();
Thread t2 = new Thread(g1);
t2.start();
for (int i = 401;i<=500 ;i++ )
{

System.out.println("main child:" +i);

}

	
	}

}
/*functional interface ==>> only consisting of single method or one method
1.runnable
2.consumer
3.supplier
4. function 
5. predicate
*/

// Marker interfaces  --> in case of marker interface they doesnt have any member
//,marker interfaces are also called as tagging interface ex:- serialiazable and clonable


