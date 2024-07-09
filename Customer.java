
public class Customer {
	
	private String name;
	private String phoneNum;
	private String sport;
	private String team;
	private double gpa;
	private String subject;
	private int numFriends;
	String friends;
	
	public Customer(String n, String p, String s, String t, double g, String sub, int numF, String f) {
		setName(n);
		setPhoneNum(p);
		setSport(s);
		setTeam(t);
		setGPA(g);
		setSubject(sub);
		setNumFriends(numF);
		setFriends(f);
	}
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	
	public void setPhoneNum(String num) {
		phoneNum = num;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setSport(String s) {
		sport =s;
	}
	public String getSport() {
		return sport;
	}
	
	public void setTeam(String t) {
		team=t;
	}
	public String getTeam() {
		return team;
	}

	public void setGPA(double g) {
		gpa=g;
	}
	public double getGPA() {
		return gpa;
	}
	
	public void setSubject(String sub) {
		subject=sub;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setNumFriends(int f) {
		numFriends=f;
	}
	public int getNumFriends() {
		return numFriends;
	}
	
	public void setFriends(String fri) {
		friends=fri;
	}
	public String getFriends() {
		return friends;
	}
}