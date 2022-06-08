package revisãopoo.domain;

public class Carro extends Terrestre implements Corridas{

    private String marca;
    private String modelo;
    private int ano;

    public Carro(int passageiros, String cor, double velocidade, int cilindrada,
        int portas, int rodas, String marca, String modelo, int ano) {
       
        super.passageiros = passageiros;
        super.cor = cor;
        super.velocidade = velocidade;
        super.cilindrada = cilindrada;
        super.portas = portas;
        super.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    //sobrecarga
    
    @Override
    public void abastecer() {
        System.out.println("");
    }    
    
    //sobrecarga e sobreposição
    
    @Override
    public void corrida(double valor){
        System.out.println("Valor definido no app.");
        System.out.println("Valor : " + valor);
    }
    
    @Override
    public void corrida(int valor){
        System.out.println("Valor acertado entre as partes!");
        System.out.println("Valor : " + valor);
    }
}
