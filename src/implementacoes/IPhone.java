package implementacoes;

import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class IPhone {
    private Telefone telefone;
    private Navegador navegador;
    private ReprodutorMusical reprodutorMusical;

    public IPhone(Telefone telefone, Navegador navegador, ReprodutorMusical reprodutorMusical) {
        this.telefone = telefone;
        this.navegador = navegador;
        this.reprodutorMusical = reprodutorMusical;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Navegador getNavegador() {
        return navegador;
    }

    public void setNavegador(Navegador navegador) {
        this.navegador = navegador;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }
}
