package com.testefelipe.alves.controller;


import com.testefelipe.alves.models.Cliente;
import com.testefelipe.alves.repository.ClienteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Data
@RestController
@RequestMapping("/felipe")
@CrossOrigin("*")
public class ClienteController {

    private String name = "felipe";
    private int idade = 10;
    private boolean ativo = false;

    @Autowired
    ClienteRepository clienteRepository;


    @GetMapping("/teste")
    public String teste(){
        System.out.println("Teste "+name);
        return "Teste "+name;
    }


    @GetMapping("/buscar")
    public ResponseEntity<List<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteRepository.findAll());
    }


}
