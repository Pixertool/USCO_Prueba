package com.edu.co.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "historico")
public class Historico implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorico;
    
    @OneToMany
   	@JoinColumn(name = "idBloque")
   	private List<Bloque> bloques;
       
       @OneToMany
   	@JoinColumn(name = "idAula")
   	private List<Aula> aulas;
       
       @OneToMany
   	@JoinColumn(name = "idMateria")
   	private List<Materia> Materias;
       
       @OneToMany
   	@JoinColumn(name = "idGrado")
   	private List<Grado> grados;
       
       @OneToMany
   	@JoinColumn(name = "idDocente")
   	private List<Docente> docentes;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;
    
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime hora_inicio;
    
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime hora_final;
    
}