/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao.rivendel;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import zoid.localizacao.CidadeMapa;

/**
 *
 * @author Fabricio
 */
public class CidadeMapaTemplate {
    
    private String nomeLocal;
    private String tipo_local;
    private String dono_local;
    private int qtd_lagos;
    private int qtd_pontes;
    private int qtd_habitantes;
    private Double tamanho_cidade;
    private Double posX;
    private Double posY;
    
    
    
    public CidadeMapaTemplate(String nomeLocal, String tipo_local, String dono_local,
            int qtd_lagos, int qtd_pontes, int qtd_habitantes, double tamanho_cidade, double posX, double posY) {
       // super(nomeLocal, nome_cidade, dono_cidade, dono_local, tipo_local, qtd_lagos, qtd_pontes, qtd_habitantes, tamanho_cidade, posX, posY);
     
            this.tipo_local = tipo_local;
            this.dono_local = dono_local;
            this.qtd_lagos = qtd_lagos;
            this.qtd_pontes = qtd_pontes;
            this.qtd_habitantes = qtd_habitantes;
            this.tamanho_cidade = tamanho_cidade;
            this.posX = posX;
            this.posY = posY;
    }

    public CidadeMapaTemplate(){
        super();
    }

    boolean carregaLocal(BufferedReader br) {
       try {
            String linha = br.readLine();
            if (linha != null) {
                StringTokenizer st = new StringTokenizer(linha, ",");
                this.nomeLocal = st.nextToken();
                this.tipo_local = st.nextToken();
                this.dono_local = st.nextToken();
                this.qtd_lagos = Integer.parseInt(st.nextToken());
                this.qtd_pontes = Integer.parseInt(st.nextToken());
                this.qtd_habitantes = Integer.parseInt(st.nextToken());
                this.tamanho_cidade = Double.parseDouble(st.nextToken());
                this.posX = Double.parseDouble(st.nextToken());
                this.posY = Double.parseDouble(st.nextToken());
                return (true);
            } else {
                return (false);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo =" + e);
            return (false);
        }
    }

    @Override
    public String toString() {
        return  nomeLocal + "," + tipo_local + "," + dono_local  + "," + qtd_lagos + "," + qtd_pontes + "," + qtd_habitantes + "," + tamanho_cidade + "," + posX + "," + posY;
    }
}
