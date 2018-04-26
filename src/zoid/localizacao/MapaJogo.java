/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author andre
 */
public class MapaJogo {
    protected String nomeMapa;
    
    protected HashMap<String,LocalMapa> listaLocais;
    protected ArrayList<Trajeto> listaTrajetos;
    
    

    public MapaJogo(String nomeMapa) {
        this.nomeMapa = nomeMapa;
    }
    
    
    public void inserirNovoLocal(String nome,LocalMapa local){
        listaLocais.put(nome, local);
    }
    
    public void inserirNovoTrajeto(Trajeto t){
        listaTrajetos.add(t);
    };
    
    
    public void salvarMapa(FileWriter fw){
        
    };  
    public boolean carregaMapa(FileReader fr){
        return false;
    };
    
    
    
}
