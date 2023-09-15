package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.*;
import model.*;


@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    @Autowired
    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.getAll();
    }

    public Optional<Reunion> getReunion(Long id) {
        return reunionRepository.getReunion(id);
    }

    public Reunion agregarReunion(Reunion reunion) {
        return reunionRepository.save(reunion);
    }

    public void eliminarReunion(Long id) {
        Optional<Reunion> reunionExistente = reunionRepository.getReunion(id);
        reunionExistente.ifPresent(reunionRepository::delete);
    }
}