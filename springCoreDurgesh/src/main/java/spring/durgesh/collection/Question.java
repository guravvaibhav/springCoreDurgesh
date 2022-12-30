package spring.durgesh.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Question {
	int qId;
	String question;
	List<Answer> answers;
	Set<Integer> mob;
	Map<String, Integer> book_Price;
	Properties bookAuth;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int qId, String question, List<Answer> answers, Set<Integer> mob, Map<String, Integer> book_Price,
			Properties bookAuth) {
		super();
		this.qId = qId;
		this.question = question;
		this.answers = answers;
		this.mob = mob;
		this.book_Price = book_Price;
		this.bookAuth = bookAuth;
	}

	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Set<Integer> getMob() {
		return mob;
	}

	public void setMob(Set<Integer> mob) {
		this.mob = mob;
	}

	public Map<String, Integer> getBook_Price() {
		return book_Price;
	}

	public void setBook_Price(Map<String, Integer> book_Price) {
		this.book_Price = book_Price;
	}

	public Properties getBookAuth() {
		return bookAuth;
	}

	public void setBookAuth(Properties bookAuth) {
		this.bookAuth = bookAuth;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", answers=" + answers + ", mob=" + mob
				+ ", book_Price=" + book_Price + ", bookAuth=" + bookAuth + "]";
	}


	
	
	

}
