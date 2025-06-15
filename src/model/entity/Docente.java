package src.model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import utils.Colors;

public class Docente
{
  private String siape;
  private String nome;
  private String classe_funcional;
  private String lotacao;
  private String email;
  private String admissao;

  private void createEmail()
  {
    String[] nomeEmail = this.nome.split(" ");

    int siapeEmail = Integer.parseInt(this.getSiape()) / 10000;

    this.email = nomeEmail[0].toLowerCase() + "." + siapeEmail+ "." + nomeEmail[nomeEmail.length-1].toLowerCase() + "@ufrn.br";
  }

  //CONSTRUCTORS
  public Docente() {}
  public Docente( ArrayList<String> informations )
  {
    this.setSiape(informations.get(0));
    this.setNome(informations.get(1));
    this.setClasse_funcional(informations.get(2));
    this.setLotacao(informations.get(3));
    this.setAdmissao(informations.get(4));
    this.createEmail();
  }

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

  public String getEmail()
  {
    return this.email;
  }

  public String getAdmissao()
  {
    return this.admissao;
  }

  //SETTERS
  public void setSiape( String siape )
  {
    this.siape = siape;
  }

  public void setNome( String nome )
  {
    this.nome = nome;
  }

  public void setClasse_funcional( String classe_funcional )
  {
    this.classe_funcional = classe_funcional;
  }

  public void setLotacao( String lotacao )
  {
    this.lotacao = lotacao;
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public void setAdmissao( String admissao )
  {
    this.admissao = admissao;
  }

  @Override
  public String toString()
  {
    return Colors.ANSI_YELLOW + " \nNOME --------------> " + getNome() + "\nSIAPE -------------> " + getSiape() + "\nCLASSE FUNCIONAL --> " + getClasse_funcional() + "\nLOTAÇÃO -----------> " + getLotacao() + "\nE-MAIL ------------> " + getEmail() + "\nADIMISSÃO ---------> " + this.admissao.toString() + Colors.ANSI_RESET;
  }
}
