
public class FriendsRecord extends Record{

	private String friends;
	
	public FriendsRecord(String n, String p, int i, String f) {
		super(n, p, i);
		setFriends(f);
	}
	
	public void setFriends(String fr) {
		friends=fr;
	}
	public String getFriends() {
		return friends;
	}
	
	public String toString() {
		return String.format("%S\nfriends are %S", super.toString(),friends);
	}

}
