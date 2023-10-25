package com.example.escola.controller;

import com.example.escola.aluno.Aluno;
import com.example.escola.aluno.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;
    @GetMapping
    public List<Aluno> getAll(){

      List<Aluno> alunoList = repository = repository.findAll();
      return alunoList;
    }
}
