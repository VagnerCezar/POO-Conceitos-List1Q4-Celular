public abstract class JogoAbstract {

        private int codigo;
        private String nome;
        private String tipo;
        private double tamanho;

        public JogoAbstract (int codigo, String nome, String tipo, double tamanho) {
            this.codigo = codigo;
            this.nome = nome;
            this.tipo = tipo;
            this.tamanho = tamanho;
        }

        //Metodos

        public abstract void Iniciar();

        public abstract void Encerrar();


        //Get e Set

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getTamanho() {
            return tamanho;
        }

        public void setTamanho(double tamanho) {
            this.tamanho = tamanho;
        }
    }
