/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import com.example.demo.Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class DepartamentoRepository {
    @Autowired
    private DepartamentoCrudRepository departamentoCrudRepository;
    
    public List<Departamento> getAll(){
        return (List<Departamento>) departamentoCrudRepository.findAll();
    }
    
}
