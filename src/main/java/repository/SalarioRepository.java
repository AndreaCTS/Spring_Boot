package repository;

import model.Salario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.crud.SalarioCrudRepository;

@Repository
public class SalarioRepository {
    @Autowired
    private SalarioCrudRepository salarioCrudRepository;

    public Salario save(Salario p){
        return salarioCrudRepository.save(p);

    }

}