package com.edu.co.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    
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
    
    @NotEmpty 
    private String fecha;
    
    @NotEmpty 
    private String hora_inicio;
    
    @NotEmpty 
    private String hora_final;
    
}