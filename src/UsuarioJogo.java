public class UsuarioJogo {
    private String nome;
    private String nickname;
    private Integer pontuacao = 0;
    private Integer nivel = 1;

    public Integer getPontuacao() {
        return this.pontuacao;
    }

    public Integer getNivel() {
        return this.nivel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNickname() {
        return this.nickname;
    }


    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao() {
        this.pontuacao++;
    }

    public void subirNivel() {
        this.nivel++;
    }
    public void bonus(Integer valor) {
        this.pontuacao += valor;
    }
}

