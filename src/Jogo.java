public class Jogo extends JogoAbstract {


        //Construtor
        public Jogo (int codigo, String nome, String tipo, double tamanho){
            super(codigo, nome, tipo, tamanho);
        }

        @Override
        public void Iniciar(){
            System.out.println("Iniciando o jogo...");
        }
        @Override
        public void Encerrar(){
            System.out.println("Encerrando o jogo...");
        }
    }
