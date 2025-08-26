public class Jogador {
    private String nome;
    private int pontuacao;
    private int vida;
    //'final' significa que o valor não pode ser alterado após a inicialização.
    //'static' significa que este valor pertence à classe, não a um objeto individual.
    private static final int Vida_Maxima = 100; //Constante

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.vida = Vida_Maxima;
        System.out.println("Jogador " + this.nome + " entrou no jogo!");
    }

    //A pontuação só pode aumentar
    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println(this.nome + " ganhou " + pontos + " pontos! Total: " + this.pontuacao);
        }
    }
        //Controla o dano recebido
public void receberDano(int dano) {
    if (dano > 0) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida atual: " + this.vida);
    }
    if (this.vida == 0) {
        System.out.println(this.nome + " foi derrotado!");
    }
}

//Controla a cura recebida não deixando passar da vida máxima
    public void receberCura(int cura) {
        if (cura > 0 && this.vida > 0) { // Só pode curar se estiver vivo
            this.vida += cura;
            if (this.vida > Vida_Maxima) this.vida = Vida_Maxima;
            System.out.println(this.nome + " recuperou " + cura + " de vida! Vida atual " + this.vida);
        }
    }

    public int getPontuacao() {return this.pontuacao;}
    public int getVida() { return this.vida; }
    public String getNome() {return this.nome; }
    }
