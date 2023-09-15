/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/departamento")
public class ControllerDepartamento {
    
    @GetMapping("/create/{nombre}")
    private void createDpto(@PathVariable("nombre") String nombre){
        Departamento dpto1 = new Departamento(nombre);
    }
    
    @GetMapping("/remove")
    private void removeDpto(){
        
    }
    
    @GetMapping("/update")
    private void updateDpto(){
        
    }
    
    @GetMapping("/delete")
    private void deleteDpto(){
        
    }
}
