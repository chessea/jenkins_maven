package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Usuario {

    private String nombre;
    private String apellidos;
    private int edad;
    
}
