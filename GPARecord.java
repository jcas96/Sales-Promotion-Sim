
public class GPARecord extends Record {

	private String subject;
	
	public GPARecord(String n, String p, int i, String sub) {
		super(n, p, i);
		setSubject(sub);
	}
	
	public void setSubject(String s) {
		subject=s;
	}
	public String getSubject() {
		return subject;
	}
	
	public String toString() {
		return String.format("%S\nfavorite subject is %S", super.toString(),subject);
	}


}
