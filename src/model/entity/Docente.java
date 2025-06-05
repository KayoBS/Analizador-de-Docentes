package model.entity;

import java.util.LocalDate;

public class Docente
{
  private String siape;
  private String nome;
  private String classe_funcional;
  private String lotacao;
  private LocalDate admissao;

  //GETTERS
  public String getSiape()
  {
    return this.siape;
  }

  public String getNome()
  {
    return this.nome;
  }

  public String getClasse_funcional()
  {
    return this.classe_funcional;
  }

  public String getLotacao()
  {
    return this.lotacao;
  }

  public LocalDate getAdmissao()
  {
    return this.admissao;
  }

  //SETTERS
  public void setSiape(String siape)
  {
    this.siape = siape;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public void setClasse_funcional(String classe_funcional)
  {
    this.classe_funcional = classe_funcional;
  }

  public void setLotacao(String lotacao)
  {
    this.lotacao = lotacao;
  }

  public void setAdmissao(LocalDate admissao)
  {
    this.admissao = admissao;
  }
}
