public class Memoria extends MemoriaAbstract{
    //Atributos

    //Construtor

    public Memoria(int codigo, String descricao, String tipo, double capacidade) {
        super(codigo, descricao, tipo, capacidade);
    }

    //Metodos

    @Override
    protected void Alocar() {
        System.out.println("A memória foi alocada com sucesso!");
    }

    @Override
    protected void Desalocar() {
        System.out.println("A memória foi desalocada com sucesso! ");
    }
}