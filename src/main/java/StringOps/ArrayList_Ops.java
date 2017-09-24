package StringOps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrayList_Ops{

	public static void main(String[] args) {
		
	    ArrayList_Ops arrayList_Ops=new ArrayList_Ops();
	   // arrayList_Ops.arrayListTest();
		arrayList_Ops.mapTest();
	}
	
	public void arrayListTest(){
		List<Object> dataList = new ArrayList<Object>();
		dataList.add(1);
		dataList.add("2");
		dataList.add(3L);
		dataList.add(true);
		dataList.add(new User());
		
		for(int i=0;i<dataList.size();i++){
			System.out.println(dataList.get(i));
		}
		
	}
	
	public void mapTest() {
		  Map usermap = new HashMap();
		  usermap.put(1, new User(1,"test"));
		  usermap.put(2, new User(2,"test2"));
		  usermap.put(3, "hello");
		  User user = (User) usermap.get(1);
		  System.out.println(user.getName());
		  
		  for(Object key:usermap.keySet())
		  {
			  Object value = usermap.get(key);
			  if(value instanceof User)
			  {
				  User u = (User)value;
				  System.out.println(u.getName());
			  }
			  else {
				System.out.println(value);
			}
	//-------------------------------------------------------------		  
			  Map<Integer, User> userMap2 = new HashMap<>();
			  userMap2.put(1, new User(1,"test1"));
			  userMap2.put(2, new User(2,"test2"));
			  System.out.println(userMap2.get(1).getName());
			  
			  for(Map.Entry<Integer, User> entry:userMap2.entrySet()){
				  System.out.println(entry.getKey()+""+entry.getValue().getName());
			  }
	//--------------------------------------------------------------
	          TreeMap sortedParams = new TreeMap();
	          sortedParams.put("test", "123");
			  sortedParams.put("test1", "1234");
			  sortedParams.put("test2", "1235");
			  sortedParams.put("test3", "1236");
			  
			  StringBuilder accum = new StringBuilder();
			  for(Object key1 : sortedParams.keySet()){
				  
			  accum.append(key1).append("=").append(sortedParams.get(key1)); 
			  }
			  System.out.println(accum); 
		  }
	}
	
	class User{
		private Integer userID;
		private String name;
		
		public User() {
			// TODO Auto-generated constructor stub
		}
		
		User(Integer userID,String name)
		{
			this.userID=userID;
			this.name=name;
		}
		
		public Integer getUserID() {
			return userID;
		}

		public void setUserID(Integer userID) {
			this.userID = userID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
