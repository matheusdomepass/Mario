package mario;

public class MarioFogo implements MarioState {
    public MarioState pegarCogumelo() {
        System.out.println("Mario perdeu 1000 pontos");
        return this;
    }

    public MarioState pegarFlor() {
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }

    public MarioState pegarPena() {
        System.out.println("Mario com capa");
        return new MarioCapa();
    }

    public MarioState levarDano() {
        System.out.println("Mario pequeno");
        return new MarioPequeno();
    }
}
