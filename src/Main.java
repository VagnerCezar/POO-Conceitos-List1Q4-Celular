//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Tela Tela1 = new Tela(1,"Tela P", "Quadrado",1.5);
        Processador Processador1 = new Processador(2,"3.7","Nano", 5.0);
        Memoria Memoria1 = new Memoria(3,"DDR3", "Slim", 4);
        Jogo Jogo1 = new Jogo(4,"Mario","Aventura",  25);


        Celular celular1 = new Celular(1,"3310", "Nokia", Tela1, Processador1, Memoria1);


    }
}