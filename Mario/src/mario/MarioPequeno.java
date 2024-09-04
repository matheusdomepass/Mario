package mario;

public class MarioPequeno implements MarioState {
    public MarioState pegarCogumelo() {
        System.out.println("Mario cresceu");
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
        System.out.println("Mario morreu");
        return new MarioPequeno();
    }
}
