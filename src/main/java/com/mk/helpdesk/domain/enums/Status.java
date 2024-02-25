package com.mk.helpdesk.domain.enums;
import com.mk.helpdesk.HelpdeskApplication;

public enum Status {
  OPEN(0, "ROLE_OPEN"), PROGRESS(1, "ROLE_PROGRESS"), CLOSED(2, "ROLE_CLOSED"); 

  
  private Integer codigo;
  private String descricao;

  private Status(Integer codigo, String descricao) {
    this.codigo = codigo;
    this.descricao = descricao;
  }

  public Integer getCodigo(){
    return codigo;
  }

  public String gedDescricao(){
    return descricao;
  }

  public static Status toEnum(Integer cod){
    if (cod == null) {
      return null;
    }

    for (Status x : Status.values()) {
      if(cod.equals(x.getCodigo())) {
        return x;
      }
    }

    throw new IllegalAccessException("Status invalido.");
  }
}