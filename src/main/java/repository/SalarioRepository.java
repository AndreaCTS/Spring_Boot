package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Salario;

@Repository
public class SalarioRepository {
	@Autowired
    private	SalarioCRUDRepository SalarioCRUDRepository;


    public List<Salario> getAll(){
        return (List<Salario>) SalarioCRUDRepository.findAll();
    }
    
    public Salario save(Salario Salario){
        return SalarioCRUDRepository.save(Salario);
    }
    public void delete(Salario Salario){
        SalarioCRUDRepository.delete(Salario);
    }
}
