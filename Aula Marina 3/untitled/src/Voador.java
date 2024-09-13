public class Voador extends Pokemon {
    private double tamanhoAsa;
    private String segundoTipo;

    public Voador (String nome, String regiao, int rota, int level, String genero, boolean lendario, double tamanhoAsa, String segundoTipo) {
        super(nome, regiao, rota, level, genero, lendario);
        this.tamanhoAsa = tamanhoAsa;
        this.segundoTipo = segundoTipo;
    }

    public String getSegundoTipo() {
        return segundoTipo;
    }
    public void setSegundoTipo(String segundoTipo) {
        this.segundoTipo = segundoTipo;
    }

}
