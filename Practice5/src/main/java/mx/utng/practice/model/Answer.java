package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="answers")
public class Answer {
	@Id @GeneratedValue
	private Long id;
	@Column(length =50)
	private String isChecked;
	@Column(length =20)
	private int examenTakeId;
	@Column(length =50)
	private String question;
	@Column(length =50)
	private String alternative;
	public Answer(String isChecked, int examenTakeId,String question,String alternative) {
		super();
		this.isChecked =isChecked;
		this.examenTakeId = examenTakeId;
		this.question=question;
		this.alternative=alternative;
	}
	
	public Answer() {
		this("",0,"","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}

	public int getExamenTakeId() {
		return examenTakeId;
	}

	public void setExamenTakeId(int examenTakeId) {
		this.examenTakeId = examenTakeId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", isChecked=" + isChecked + ", examneTakeId=" + examenTakeId + ", question=" + question + ",alternative=" +alternative+   "]";
	}
	
}
