package mario;
public class MarioPersonagem {
  protected MarioState estado;

  public MarioPersonagem() { 
      estado = new MarioPequeno(); 
  }

  public void pegarCogumelo() {
    estado = estado.pegarCogumelo();
  }

  public void pegarFlor() {
    estado = estado.pegarFlor();
  }

  public void pegarPena() {
    estado = estado.pegarPena();
  }

  public void levarDano() {
    estado = estado.levarDano();
  }
}
