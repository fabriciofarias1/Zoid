/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author andre
 */
public class LocalAvatar extends LocalJogo{

    public LocalAvatar(String nomeLocal, double posX, double posY) {
        super(nomeLocal, posX, posY);
    }

    @Override
    public void salvarLocal(FileWriter fw) {
       
    }

    @Override
    public boolean carregaLocal(BufferedReader br) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
