
package src;

import javax.swing.JTextField;

public class ModelProduto {
    private String cod;
    private String nome;
    private String quant;
    private String tipo;

    public ModelProduto(String cod){
        this.cod = cod;
    }

    public ModelProduto(String cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public ModelProduto(String cod, String nome, String quant, String tipo) {
        this.cod = cod;
        this.nome = nome;
        this.quant = quant;
        this.tipo = tipo;
    }

    ModelProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getQuant() {
        return quant;
    }

    public String getTipo() {
        return tipo;
    }
}
