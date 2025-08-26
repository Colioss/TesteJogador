public class TesteJogador {
    public static void main(String[] args) {
        System.out.println("Simulando uma Partida");
        Jogador heroi = new Jogador("Juuzou");

        //1. Começando a partida
        System.out.println("\nDerrotando um inimigo..");
        heroi.adicionarPontos(50);
        //2. Entrando em uma batalha
        System.out.println("\nRecebendo um ataque forte...");
        heroi.receberDano(40); //Vida vai para 60

        //3. Usando um item de cura
        System.out.println("\nUsando uma poção...");
        heroi.receberCura(25); //Vida vai para 85
        //4. Tentando curar além do máximo
        System.out.println("\nUsando outra poção forte...");
        heroi.receberCura(30); //Tentaria ir para 115, mas a lógica vai travar em 100

        //5. Recebendo dano letal
        System.out.println("\nRecebendo um ataque devastador...");
        heroi.receberDano(150); //A vida vai para 0, não para -50
        // 6. tentativa de manipulação direta (ilegal)
        //A linha abaixo causará um erro de compliação, protegendo o estado do jogador.
        //heroi.vida = 9999; // Erro: 'vida' tem acesso privado em 'jogador'
    }
}
