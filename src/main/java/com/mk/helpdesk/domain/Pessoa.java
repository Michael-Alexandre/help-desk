package com.mk.helpdesk.domain;

import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;

import com.mk.helpdesk.domain.enums.*;

public abstract class Pessoa {
  protected Integer id;
  protected String nome;
  protected String email;
  protected String senha;
  protected Set<Perfil> perfis = new HashSet<>();
  protected LocalDate dataCriacao = LocalDate.now();

  public Pessoa(){
    super();
  }

  public Pessoa(Integer id, String nome, String email, String senha) {
    super();
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
  }

  Public Integer getId(){
    return id;
  }

}
