import implementacoes.IPhone;
import implementacoes.navegador.Safari;
import implementacoes.reprodutorMusical.ITune;
import implementacoes.reprodutorMusical.Spotify;
import implementacoes.telefone.TelefonePadrao;

public class Principal {
    public static void main(String[] args) {

        //Criando aparelho padrão - Mobile inicializado com aplicativos padrões de fabrica
        IPhone iPhone=new IPhone(new TelefonePadrao(),new Safari(),new ITune());

        //Reproduzindo musica
        iPhone.getReprodutorMusical().reproduzirMusica(); //Saída do iTune

        //Trocando reprodutor musical
        iPhone.setReprodutorMusical(new Spotify());

        //Reproduzindo em outra implementação
        iPhone.getReprodutorMusical().reproduzirMusica(); //Saída do Spotify

        /*Ainda é possivel trocar o navegador usando o mesmo principio, como o iPhone é composto de interfaces, podemos
        * intercambiar entre implementações diferentes*/
    }
}
