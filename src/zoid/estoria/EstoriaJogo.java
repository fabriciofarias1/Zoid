/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.estoria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class EstoriaJogo {
    private String nomeEstoria;
    private ArrayList<FrasesEstoria> listaFrases;      

    public EstoriaJogo(String nomeEstoria) {
        this.nomeEstoria = nomeEstoria;
    }
    
    public String gerarEstoriaString(){
        return "";
    }
    public void gerarEstoriaArquivo(String nomeArq){
        
    }
    
    public void inserirFrase(FrasesEstoria f){
        listaFrases.add(f);
    }
    
    public void salvarEstoria(FileWriter fw){
        
    };  
    public boolean carregarEstoria(BufferedReader br){
        
        return false;
    };
    
    
}
