package spring.durgesh.collection;

public class Answer {
	int aId;
	String answer;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String answer) {
		super();
		this.aId = aId;
		this.answer = answer;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", answer=" + answer + "]";
	}
	

}
