package com.mk.helpdesk.domain.enums;
import com.mk.helpdesk.HelpdeskApplication;

public enum Perfil {
  ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENT"), TECNICO(2, "ROLE_TECH"); 

  
  private Integer codigo;
  private String descricao;

  private Perfil(Integer codigo, String descricao) {
    this.codigo = codigo;
    this.descricao = descricao;
  }

  public Integer getCodigo(){
    return codigo;
  }

  public String gedDescricao(){
    return descricao;
  }

  public static Perfil toEnum(Integer cod){
    if (cod == null) {
      return null;
    }

    for (Perfil x : Perfil.values()) {
      if(cod.equals(x.getCodigo())) {
        return x;
      }
    }

    throw new IllegalAccessException("Perfil invalido.");
  }
}