public class Tela extends TelaAbstract{

    //Atributos

    //Construtor
    public Tela(int codigo, String descricao, String tipo, double tamanho) {
        super(codigo, descricao, tipo, tamanho);
    }

    //Metodos

    @Override
    public void Ligar() {
        System.out.println("Ligando a tela...");
    }

    @Override
    public void Desligar() {
        System.out.println("Desligando a tela...");

    }
}
