/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.pets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import zoid.avatar.Avatar;

/**
 *
 * @author andre
 */
public abstract class AvatarPet extends Avatar {
    protected String estadoHumor;
    //Humor
    public static final String ALEGRE = "Alegre";
    public static final String TRISTE = "Triste";
    public static final String ZANGADO = "Zangado";
    public static final String FOME   = "Com Fome";
    public static final String ALERTA = "Alerta";
    public static final String PERIGO = "Perigo a volta";
    
    
    //Lista de Acoes
    public static final int ATACAR = 0;
    public static final int GUARDA = 1;
    public static final int PERSEGUIR = 2;
    public static final int RECONHECIMENTO = 3;
    public static final int PARAR = 4;
    
    public AvatarPet(String nomeAvatar, int idadeAvatar) {
        super(nomeAvatar, idadeAvatar,0, 1);
    }

    public abstract void alimentar();
    public abstract void agradar();
    public abstract void ordenar(int acao);
    
    
    
    @Override
    public void salvarAvatar(FileWriter fw) {
     
    }

    @Override
    public boolean carregaAvatar(BufferedReader br) {
     return true;
    }

    public String getEstadoHumor() {
        return estadoHumor;
    }

    public void setEstadoHumor(String estadoHumor) {
        this.estadoHumor = estadoHumor;
    }
    
    
    
    
}
