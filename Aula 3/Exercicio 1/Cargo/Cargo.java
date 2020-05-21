public class Cargo {
  private String nome;
  private String descricao;
  private double pisoSalarial;
  private double cargaHoraria;

  public String getNome(){
    return nome;
  }

  public String getDescricao(){
    return descricao;
  }

  public double getPisoSalarial(){
    return pisoSalarial;
  }

  public double getCargaHoraria(){
    return cargaHoraria;
  }

  public void setNome(String novoNome){
    nome = novoNome;
  }

  public void setDescricao(String novaDesc){
    descricao = novaDesc;
  }

  public void setPisoSalarial(double novoPiso){
    pisoSalarial = novoPiso;
  }

  public void setCargaHoraria(double novaCarga){
    cargaHoraria = novaCarga;
  }

}