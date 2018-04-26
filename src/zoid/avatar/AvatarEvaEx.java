/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.avatar;

import java.io.BufferedReader;
import java.io.FileWriter;

/**
 *
 * @author andre
 */
public class AvatarEvaEx extends AvatarFeminino{

    public AvatarEvaEx(String nomeAvatar, int idadeAvatar, double alturaAvatar, double pesoAvatar) {
        super("EvaExi", 1, 1.60, 55.0);
        
        
        
        
    }

    @Override
    public void salvarAvatar(FileWriter fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean carregaAvatar(BufferedReader br) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
