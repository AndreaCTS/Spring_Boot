package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.Salario;
import repository.SalarioRepository;
@Service
public class SalarioService {

	 @Autowired
	    private SalarioRepository SalarioRepository;

	    public List<Salario> getAll(){
	        return SalarioRepository.getAll();
	    }
	    
}
