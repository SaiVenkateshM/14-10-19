package assesment;
import java.util.*;

public class Program9 {
	static LinkedList<String> ls=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program9 pr = new Program9();
		Scanner sc=new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		Iterator<String> reverse=pr.ls.descendingIterator();
		while(reverse.hasNext()) {
		System.out.print(reverse.next()+" ");
		}
		System.out.println("\n");

}
}