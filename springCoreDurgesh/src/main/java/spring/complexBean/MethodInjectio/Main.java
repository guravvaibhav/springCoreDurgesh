package spring.complexBean.MethodInjectio;

public abstract class Main {
	int j;
	Dependent d;
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Main(int j, Dependent d) {
		super();
		this.j = j;
		this.d = d;
	}
	
	protected abstract Dependent createDependent();				// lookup
	
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public Dependent getD() {
		return createDependent();
	}
	public void setD(Dependent d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Main [j=" + j + ", d=" + d + "]";
	}
	
	

}
