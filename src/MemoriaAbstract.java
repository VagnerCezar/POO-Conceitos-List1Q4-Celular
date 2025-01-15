public abstract class MemoriaAbstract {
    //Atributos
    private int codigo;
    private String descricao;
    private String tipo;
    private double capacidade;

    //Construtor
    public MemoriaAbstract(int codigo, String descricao, String tipo, double capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    //Metodos
    protected abstract void Alocar();
    protected abstract void Desalocar();


    //Get e Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
