package assesment;
import java.util.*;
public class Program12 {
	static LinkedList<String> ls=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program10 pr = new Program10();
		Scanner sc=new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		ArrayList<String> arrlist=new ArrayList<>(pr.ls);
		System.out.println("Arraylist");
		for(String aa:arrlist) {
			System.out.print(aa+" ");
		}
		System.out.println("\n");
	}

}
