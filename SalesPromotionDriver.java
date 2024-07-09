import java.util.ArrayList;
import java.util.function.BiFunction;

public class SalesPromotionDriver {

	final static Customer[] customers = {new Customer("John Smith" , "9084321212", "football","Giants", 3.61, null , 0, null)
			,new Customer("Indira Patel" , "7325551234", "tennis" ,null , 3.92, "Java" , 0, null)
			,new Customer("Sarah Johnson", "2123231245", "football","Eagles", 3.71, null , 1,"Jane Hernadez,2017765765")
			,new Customer("Javier Jones" , "8568768765", "golf" ,null , 3.85, "Physics", 1,"Maria Regina,9086547654")};
	
	private static void matchCustomers(Customer cust, ArrayList<BiFunction<Customer,Integer, ? extends Record>>biFal) {
		for(int j=0;j<biFal.size();j++) {
			Record record;
			int ind=0;
			do {
				record = biFal.get(j).apply(cust, ind);
				if(record!=null) {
					System.out.printf("\n%S\n", record.toString());
					ind=record.getIndex()+1;
				}
			}while(record!=null);
		System.out.printf("\n");
		}
		
		
	}
	public static void main(String[] args) {
		BiFunction <Customer, Integer, SportRecord> fSport = (x,z)->{
				SportRecord sportRec=null;
				for(int i=z;i<customers.length &&sportRec==null;i++) {
					if(customers[i].getSport()==x.getSport()) {
						Customer one= customers[i];
						sportRec=new SportRecord(one.getName(),one.getPhoneNum(),i,one.getTeam());
					}
				}
				return sportRec;
		};
		
		BiFunction<Customer, Integer, GPARecord> fGPA = (x,z)->{
			GPARecord gpaRec = null;
			for(int i =z;i<customers.length&&gpaRec==null;i++) {
				if(customers[i].getGPA()>=x.getGPA()) {
					Customer one = customers[i];
					gpaRec = new GPARecord(one.getName(),one.getPhoneNum(),i,one.getSubject());
				}
			}
			return gpaRec;
		};
		
		BiFunction <Customer, Integer, FriendsRecord> fFriends = (x,z)->{
				FriendsRecord friendsRec =null;
				for(int i=z;i<customers.length&&friendsRec==null;i++) {
					if(customers[i].getNumFriends()>=x.getNumFriends()) {
						Customer one = customers[i];
						friendsRec = new FriendsRecord(one.getName(),one.getPhoneNum(),i,one.getFriends());
					}
				}
				return friendsRec;
			};
			
			ArrayList<BiFunction<Customer,Integer, ? extends Record>>list = new ArrayList<BiFunction<Customer,Integer,? extends Record>>();
			list.add(fSport);
			list.add(fGPA);
			list.add(fFriends);
			System.out.printf("SUNDAY FOOTBALL PROMOTION - Call the following customers");
			matchCustomers(new Customer(null, null, "football", null,Double.MAX_VALUE, null, Integer.MAX_VALUE, null), list);
			System.out.printf("TUESDAY HIGH-TECH PROMOTION - Call the following customers");
			matchCustomers(new Customer(null, null, null, null, 3.75,null, Integer.MAX_VALUE, null), list);
			System.out.printf("FRIDAY BRING A FRIEND PROMOTION - Call the following customers");
			matchCustomers(new Customer(null, null, null, null,Double.MAX_VALUE, null, 1, null), list);
		}

}
