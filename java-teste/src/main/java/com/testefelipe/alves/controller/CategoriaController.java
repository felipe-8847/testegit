package com.testefelipe.alves.controller;


import com.testefelipe.alves.models.Cliente;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

    Cliente cliente = new Cliente(1L,"Felipe");

    @GetMapping("/zzz")
    public String testee(){
        return  cliente.toString();
    }

}
