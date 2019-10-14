package assesment;
import java.util.*;
public class Program11 {
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
		 System.out.println("Last element is : "+pr.ls.get(pr.ls.size()-1));
	}

}
