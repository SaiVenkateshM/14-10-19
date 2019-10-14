package assesment;
import java.util.*;
public class Program10 {
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
		 System.out.println("Enter the element");
			sc.nextLine();
			String a=sc.nextLine();
			if(pr.ls.contains(a)) {
				 System.out.println("First Index : "+pr.ls.indexOf(a));
				 System.out.println("Last index : "+pr.ls.lastIndexOf(a));
			}
			else System.out.println("Element is not present in array");
	}

}
