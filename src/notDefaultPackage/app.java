package notDefaultPackage;

import java.util.HashMap;
import java.util.Map;

public class app {
	
	public static void main(String[] args) {
		Service serv = new Service();
		
		String json1;
		String json2;
		String json3;
		
		
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		Account acc1 = new Account("Maciej", "Przybylo", 10);
		Account acc2 = new Account("Janusz", "Smith", 10);
		Account acc3 = new Account("Bogdan", "GrraazYna", 10);
		map.put(1, acc1);
		map.put(2, acc2);
		map.put(3, acc3);

//		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
//			int key = entry.getKey();
//			Account b = entry.getValue();
//			System.out.println(key + " Details:");
//			System.out.println(b.getFirstName()+" "+b.getLastName()+" "+b.getAccountNumber()+" ");  	
//		}
		
		json1 = serv.javaToJson(acc1);
		json2 = serv.javaToJson(acc2);
		json3 = serv.javaToJson(acc3);
		
		System.out.println(json1);
		System.out.println(json2);
		System.out.println(json3);
		
	}
}
