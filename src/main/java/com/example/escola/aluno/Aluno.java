package com.example.escola.aluno;

@Table(name = "aluno")
@Entity(name = "alunos")
public class Aluno {
@Id @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nomeProfessor;
    private Integer idade;
    private Integer numSala;
    private int notaPrimeiroSem;
    private int notaSegundoSem;

}
