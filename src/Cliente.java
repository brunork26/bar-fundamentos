/**
 * Created by brunork on 27/03/18.
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private char genero;
    private boolean socio;
    private int numSocio;
    private boolean pMilhagens;

    public Cliente(String nome, String cpf, int idade, char genero, boolean socio){
        this(nome, cpf, idade, genero,socio, -1, false);

    }
    public Cliente(String nome, String cpf, int idade, char genero, boolean socio, int numSocio, boolean pMilhagens){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.socio = socio;
        this.numSocio = numSocio;
        this.pMilhagens = pMilhagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public boolean ispMilhagens() {
        return pMilhagens;
    }

    public void setpMilhagens(boolean pMilhagens) {
        this.pMilhagens = pMilhagens;
    }
}
