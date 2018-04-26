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
public class Trajeto {
    private LocalMapa localInicial;
    private LocalMapa localFinal;
    private double    distanciaTrajeto;

    public Trajeto(LocalMapa localInicial, LocalMapa localFinal) {
        this.localInicial = localInicial;
        this.localFinal = localFinal;
    }
    
    
    public void salvarTrajeto(FileWriter fw){
        
    };  
    public boolean carregaTrajeto(BufferedReader br){
        return false;
    };
    
}
