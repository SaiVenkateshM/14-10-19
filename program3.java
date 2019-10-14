package assesment;
import java.util.*;
public class program3 {
	static List<String> ls= new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program3 pr = new program3();
		Scanner sc = new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("Enter the element to search");
		String s = sc.next();
		pr.Search(s);
	}

	public void Search(String s) {
		String f= s;
		if(ls.contains(f)){
			System.out.println("Index of element is: "+ ls.indexOf(f));
		}
		else System.out.println("Element is not present in array");
	
		
		   }  
		   
		  }  



