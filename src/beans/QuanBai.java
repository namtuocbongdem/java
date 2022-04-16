package beans;

public class QuanBai {
	public String name;
	public int point;
	public int exp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public QuanBai(String name, int point, int exp) {
		super();
		this.name = name;
		this.point = point;
		this.exp = exp;
	}
	public QuanBai() {
		super();
	}
	@Override
	public String toString() {
		return " name=" + name + " \t\t point=" + point + "\t\texp=" + exp ;
	}
	
	
}

