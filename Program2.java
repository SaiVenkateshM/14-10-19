package assesment;
import java.util.*;
public class Program2 {
	static List<String>ls= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		ls.add("Maruvada");
		ls.add("Sai");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("The retrieve index value :-" );
		int s = sc.nextInt();
		retrieveValues(s);
	}

public static void retrieveValues(int s)
{
   
   String t = ls.get(s);
   System.out.println(t);
}
}