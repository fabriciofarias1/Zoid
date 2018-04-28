/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.jogo;

/**
 *
 * @author andre
 */
public class JogoArquivo extends Jogo{
    private String arqJogo;

    public JogoArquivo(String arqJogo, String tituloJogo) {
        super(tituloJogo);
        this.arqJogo = arqJogo;
    }



    @Override
    public void salvarJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
