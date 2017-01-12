package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import mx.utng.practice.model.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Long> {
	@Query("select departament from Departament departament")
	public List<Departament> finAll();
}
