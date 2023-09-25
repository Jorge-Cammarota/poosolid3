package Exercicio4;

public class Main {
    public static void main(String[] args) {


        Exercicio4.Animal camelo = new Exercicio4.Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);

        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Exercicio4.Animal tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Exercicio4.Animal urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Exercicio4.Animal[] animais = new Exercicio4.Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println();
        for (Exercicio4.Animal animal : animais) {
            System.out.println(animal);
            System.out.println();
        }
    }
}