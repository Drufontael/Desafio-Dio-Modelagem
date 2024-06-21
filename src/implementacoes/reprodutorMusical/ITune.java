package implementacoes.reprodutorMusical;

import interfaces.ReprodutorMusical;

public class ITune implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("iTune reproduzindo musica.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("iTune pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("iTune selecionando musica.");
    }
}
