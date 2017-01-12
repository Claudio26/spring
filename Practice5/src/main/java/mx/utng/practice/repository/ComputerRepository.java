package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import mx.utng.practice.model.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
	@Query("select computer from Computer computer")
	public List<Computer> finAll();
}
