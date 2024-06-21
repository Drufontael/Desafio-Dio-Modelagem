package implementacoes.navegador;

import interfaces.Navegador;

public class Chrome implements Navegador {
    @java.lang.Override
    public void exibirPagina() {
        System.out.println("Chrome exibindo página.");
    }

    @java.lang.Override
    public void adicionarAba() {
        System.out.println("Chrome adicionando aba.");
    }

    @java.lang.Override
    public void atulizarPag() {
        System.out.println("Chrome atualizando página.");
    }
}
