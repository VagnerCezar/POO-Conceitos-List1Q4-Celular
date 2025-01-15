public abstract class CelularAbstract {

        //Atributos
        private int codigo;
        private String modelo;
        private String marca;
        // lista jogos
        private Tela tela;
        private Processador processador;
        private Memoria memoria;

        //Construtor
        public CelularAbstract(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria) {
            this.codigo = codigo;
            this.modelo = modelo;
            this.marca = marca;
            this.tela = tela;
            this.processador = processador;
            this.memoria = memoria;
        }

        //Metodos

        public abstract void Ligar();
        public abstract void Desligar();
        public abstract void Chamar();

        //Get e Set
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public Tela getTela() {
            return tela;
        }

        public void setTela(Tela tela) {
            this.tela = tela;
        }

        public Processador getProcessador() {
            return processador;
        }

        public void setProcessador(Processador processador) {
            this.processador = processador;
        }

        public Memoria getMemoria() {
            return memoria;
        }

        public void setMemoria(Memoria memoria) {
            this.memoria = memoria;
        }
    }
