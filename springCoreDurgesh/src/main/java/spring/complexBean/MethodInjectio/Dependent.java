package spring.complexBean.MethodInjectio;

public class Dependent {
	int i;

	public Dependent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dependent(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Dependent [i=" + i + "]";
	}

}
