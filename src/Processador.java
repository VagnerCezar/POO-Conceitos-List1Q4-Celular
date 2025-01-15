public class Processador extends ProcessadorAbstract{
    //Atributos

    //Construtor

    public Processador(int codigo, String descricao, String tipo, double velocidade) {
        super(codigo, descricao, tipo, velocidade);
    }

    //Metodo

    @Override
    public void Acelerar() {
        System.out.println("Acelerando o processamento... ");
    }

    @Override
    public void Desacelerar() {
        System.out.println("Desacelerando o processamento... ");
    }
}
