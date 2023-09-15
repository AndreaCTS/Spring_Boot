package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.*;
import service.*;

@RestController
@RequestMapping("/reuniones")
public class ReunionController {

    private final ReunionService reunionService;

    @Autowired
    public ReunionController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    @GetMapping("/")
    public List<Reunion> obtenerTodasLasReuniones() {
        return reunionService.getAllReuniones();
    }

    @GetMapping("/{id}")
    public Optional<Reunion> obtenerReunionPorId(@PathVariable Long id) {
        return reunionService.getReunion(id);
    }

    @PostMapping("/")
    public Reunion agregarReunion(@RequestBody Reunion reunion) {
        return reunionService.agregarReunion(reunion);
    }

    @DeleteMapping("/{id}")
    public void eliminarReunion(@PathVariable Long id) {
        reunionService.eliminarReunion(id);
    }
}
