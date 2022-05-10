package exer1;

//criando classe jogador
public class Jogador {

    private double pontuacao;
    private String nome;
    public boolean ativado;
    

    public Jogador(String nome, int pontuacao,    boolean ativado) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.ativado = ativado;
                        }

    //Metodos Getters e Setters
    
    public double getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAtivado() {
        return ativado;
    }
    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    } 
      
    
}