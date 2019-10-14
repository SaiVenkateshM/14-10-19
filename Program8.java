package assesment;
import java.util.*;

public class Program8 {
	static LinkedList<String> ls=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 pr = new Program8();
		Scanner sc=new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("Enter the staring index");
		ListIterator<String> iterator=  pr.ls.listIterator(Integer.parseInt(sc.next()));
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println("\n");
	}

}
