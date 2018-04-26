/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.grupo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import zoid.avatar.Avatar;

/**
 *
 * @author andre
 */
public class GrupoJogo {    
    private String nomeGrupo;
    private ArrayList<Avatar> membrosGrupo;

    public GrupoJogo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }
    
    
    
    public void inserirMembro(Avatar avatar){
        membrosGrupo.add(avatar);
    }
    
        public void salvarGrupo(FileWriter fw){
        
    };  
    public boolean carregaGrupo(BufferedReader br){
        return false;
    };
    
    
}
