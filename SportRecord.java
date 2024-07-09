
public class SportRecord extends Record {

	private String team;
	
	public SportRecord(String n, String p, int i, String t) {
		super(n, p, i);
		setTeam(t);
	}
	
	public void setTeam(String t) {
		team=t;
	}
	public String getTeam() {
		return team;
	}
	
	public String toString() {
		return String.format("%S\nfavorite team is the %S",super.toString(), team);
	}
	

}
