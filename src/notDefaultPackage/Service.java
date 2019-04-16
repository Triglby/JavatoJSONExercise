package notDefaultPackage;

import com.google.gson.Gson;

public class Service {
	Gson gson = new Gson();
	
	
	public String javaToJson(Account acc) {
		String jsonObj = gson.toJson(acc);
		return jsonObj;
	}
	
	
}
