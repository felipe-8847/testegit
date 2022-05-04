package com.testefelipe.alves.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


// get e seters e construtores dessa classe
@Data
@NoArgsConstructor
@AllArgsConstructor
//----------
// Entidade ou model da class
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Override
    public String toString() {
        return "Cliente {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
