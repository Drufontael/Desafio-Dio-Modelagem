package implementacoes.navegador;

import interfaces.Navegador;

public class Safari implements Navegador {
    @java.lang.Override
    public void exibirPagina() {
        System.out.println("Safari exibindo página.");
    }

    @java.lang.Override
    public void adicionarAba() {
        System.out.println("Safari adicionando aba.");
    }

    @java.lang.Override
    public void atulizarPag() {
        System.out.println("Safari atualizando página.");
    }
}
