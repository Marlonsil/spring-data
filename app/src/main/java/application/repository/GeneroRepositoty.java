package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Genero;

public interface GeneroRepositoty extends CrudRepository<Genero, Long> {
    
}
