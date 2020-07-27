package pe.edu.upeu.examen.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.dao.LibroDao;
import pe.edu.upeu.examen.entity.Libro;
import pe.edu.upeu.examen.service.LibroService;

@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		return librodao.readAll();
	}

}
