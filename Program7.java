package assesment;
import java.util.*;
public class Program7 {
	static LinkedList<String> ls=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 pr = new Program7();
		Scanner sc=new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("Enter index of to add at last position");
		int x=Integer.parseInt(sc.next())-1;
		String temp=pr.ls.get(x);
		pr.ls.remove(x);
		pr.ls.add(temp);
		pr.print();
		
	}

}