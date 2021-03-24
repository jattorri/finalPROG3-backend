package com.example.plato.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "plato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Plato extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private String precio;
    @Column(name = "rubro")
    private String rubro;
    @Column(name = "imagen")
    private String imagenPath;
    @Column(name = "ingredientes")
    private ArrayList<String> ingredientes = new ArrayList<>();
}
