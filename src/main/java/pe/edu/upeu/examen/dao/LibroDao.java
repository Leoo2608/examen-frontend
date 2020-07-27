package pe.edu.upeu.examen.dao;

import java.util.List;


import pe.edu.upeu.examen.entity.Libro;

public interface LibroDao {
	List<Libro> readAll();
}
