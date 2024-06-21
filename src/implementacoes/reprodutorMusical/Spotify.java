package implementacoes.reprodutorMusical;

import interfaces.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Spotify reproduzindo musica.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Spotify pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Spotify selecionando musica.");
    }
}
