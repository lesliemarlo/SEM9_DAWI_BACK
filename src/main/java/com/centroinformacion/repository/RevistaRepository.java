package com.centroinformacion.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centroinformacion.entity.Revista;

public interface RevistaRepository extends JpaRepository<Revista, Integer>{
	

	@Query("select e from Revista e where e.nombre like ?1 ")
	public abstract List<Revista> listaPorNombreLike(String nombre);
	
	@Query("select e from Revista e where e.nombre = ?1 ")
	public abstract List<Revista> listaPorNombreIgualRegistra(String nombre);
	
	@Query("select e from Revista e where e.nombre = ?1 and e.idRevista != ?2 ")
	public abstract List<Revista> listaPorNombreIgualActualiza(String nombre, int idRevista);
	
		
	
}
