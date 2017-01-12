package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Answer;


public interface AnswerRepository extends JpaRepository<Answer, Long> {
	@Query("select answer from Answer answer")
	public List<Answer> finAll();
}
