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
public class AvatarAdaoEx1 extends AvatarMasculino{

    public AvatarAdaoEx1(String nomeAvatar, int idadeAvatar, double alturaAvatar, double pesoAvatar) {
        super("AdaoEx1", 2, 2.0, 80);
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
