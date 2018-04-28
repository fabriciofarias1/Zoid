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
public abstract class LocalJogo {
    protected String nomeLocal;
    protected double posX;
    protected double posY;

    public LocalJogo(String nomeLocal, double posX, double posY) {
        this.nomeLocal = nomeLocal;
        this.posX = posX;
        this.posY = posY;
    }
          
    public abstract void salvarLocal(FileWriter fw);  
    public abstract boolean carregaLocal(BufferedReader br);
    
}
