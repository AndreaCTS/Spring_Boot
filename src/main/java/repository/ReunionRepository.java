package repository;
import model.*;
import repository.crud.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReunionRepository {
    @Autowired
    private ReunionCrudRepository reunionCrudRepository;

    public List<Reunion> getAll() {
        return (List<Reunion>) reunionCrudRepository.findAll();
    }

    public Optional<Reunion> getReunion(Long id) {
        return reunionCrudRepository.findById(id);
    }

    public Reunion save(Reunion reunion) {
        return reunionCrudRepository.save(reunion);
    }

    public void delete(Reunion reunion) {
        reunionCrudRepository.delete(reunion);
    }
}