package implementacoes.telefone;

import interfaces.Telefone;

public class TelefonePadrao implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Efetuando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz.");
    }
}
