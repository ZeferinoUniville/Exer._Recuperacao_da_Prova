public class Pessoa {

  private String nome;
  private String sobrenome;
  private String sexo;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void hello(String nome, String sobrenome, String sexo, int idade) {
    setNome(nome);
    setSobrenome(sobrenome);
    setSexo(sexo);
    setIdade(idade);
    System.out.println(
        "Olá " + getNome() + " " + getSobrenome() + " do sexo " + getSexo() + " e tem " + getIdade() + " anos");
  }

  public void hello(String nome, String sobrenome, String sexo) {
    setNome(nome);
    setSobrenome(sobrenome);
    setSexo(sexo);
    System.out.println("Olá " + getNome() + " " + getSobrenome() + " do sexo " + getSexo());
  }

  public void hello(String nome, String sobrenome) {
    setNome(nome);
    setSobrenome(sobrenome);
    System.out.println("Olá " + getNome() + " " + getSobrenome());
  }

  public void hello(String nome) {
    setNome(nome);
    setSobrenome(sobrenome);
    System.out.println("Olá " + getNome());
  }

  public void hello(int idade) {
    setIdade(idade);
    System.out.println("Olá pessoa não identificada que tem " + getIdade() + " anos");
  }

}