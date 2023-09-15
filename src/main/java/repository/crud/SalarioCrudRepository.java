package repository.crud;

import model.Salario;
import org.springframework.data.repository.CrudRepository;

public interface SalarioCrudRepository extends CrudRepository<Salario,Integer> {
}