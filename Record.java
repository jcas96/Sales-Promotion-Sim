
public abstract class Record {
	private String name;
	private String phoneNum;
	private int index;
	
	public Record(String n, String p, int i) {
		setName(n);
		setPhoneNum(p);
		setIndex(i);
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
	
	public void setIndex(int i) {
		index=i;
	}
	public int getIndex() {
		return index;
	}
	
	public String toString() {
		return String.format("name: %S phone number: %S", name,phoneNum);
		
	}

}
