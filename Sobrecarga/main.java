public class main {

  public static void main(String args[]) {
    Pessoa pessoa = new Pessoa();
    pessoa.hello("Matheus", "Zeferino", "Masculino", 19);
    pessoa.hello("Matheus", "Zeferino", "Masculino");
    pessoa.hello("Matheus", "Zeferino");
    pessoa.hello("Matheus");
    pessoa.hello(19);
  }

}
