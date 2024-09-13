public class Venenoso extends Pokemon {
    private int nivelVeneno;
    private String segundoTipo;

    public Venenoso (String nome, String regiao, int rota, int level, String genero, boolean lendario, int nivelVeneno, String segundoTipo) {
        super(nome, regiao, rota, level, genero, lendario);
        this.nivelVeneno = nivelVeneno;
        this.segundoTipo = segundoTipo;
    }

    public String getSegundoTipo() {
        return segundoTipo;
    }
    public int getNivelVeneno() {
        return nivelVeneno;
    }
    public void setSegundoTipo(String segundoTipo) {
        this.segundoTipo = segundoTipo;
    }

}
