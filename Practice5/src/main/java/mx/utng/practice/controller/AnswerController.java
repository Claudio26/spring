package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Answer;
import mx.utng.practice.repository.AnswerRepository;

@Named
@ViewScoped
public class AnswerController {
	@Autowired
	private AnswerRepository answerRepository;
	private Answer answer = new Answer();
   private List<Answer> answers;
   private boolean editMode = false;
   
   @PostConstruct
	public void init(){
	   setAnswers(answerRepository.finAll());
	}
   
	public void save(){
		answerRepository.save(answer);
		if(!editMode){
		 getAnswers().add(answer);
		}
		answer = new Answer();
		setEditMode(false);
		}
	
	public void delete(Answer answer){
		answerRepository.delete(answer);
		answers.remove(answer);
	}
	
	public void update(Answer answer){
		setAnswer(answer);
		setEditMode(true);
	}
	public void cancel(){
		answer = new Answer();
		setEditMode(false);
	}
	
	public AnswerRepository getAnswerRepository() {
		return answerRepository;
	}

	public void setAnswerRepository(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}	
}
