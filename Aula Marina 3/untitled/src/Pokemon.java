public class Pokemon {
    private String nome;
    private String regiao;
    private int rota;
    private int level;
    private String genero;
    private boolean lendario;

    public Pokemon (String nome, String regiao, int rota, int level, String genero, boolean lendario) {
        this.nome = nome;
        this.regiao = regiao;
        this.rota = rota;
        this.level = level;
        this.genero = genero;
        this.lendario = lendario;
    }

    public boolean isLendario() {
        return lendario;
    }
    public String getNome() {
        return nome;
    }
    public String getRegiao() {
        return regiao;
    }
    public int getRota() {
        return rota;
    }
    public double getLevel() {
        return level;
    }


}

