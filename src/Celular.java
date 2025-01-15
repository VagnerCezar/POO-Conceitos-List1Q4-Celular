public class Celular extends CelularAbstract {

        //Atributos

        //Construtor
        public Celular (int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria){
            super(codigo, modelo, marca, tela, processador, memoria);
        }

        //Metodos
        @Override
        public void Ligar(){
            System.out.println(" ");

        }
        @Override
        public void Desligar(){
            System.out.println(" ");

        }
        @Override
        public void Chamar(){
            System.out.println(" ");
        }
    }
