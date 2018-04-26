/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.function.ToDoubleFunction;
import java.util.logging.Level;
import java.util.logging.Logger;
import zoid.localizacao.rivendel.CidadeMapaRivendel;
import zoid.localizacao.rivendel.CidadeMapaView;

/**
 *
 * @author andre
 */
public class CidadeMapa extends LocalMapa {

    //private String nome_cidade;
    private String tipo_local;
    private String dono_local;
    private int qtd_lagos;
    private int qtd_pontes;
    private int qtd_habitantes;
    private Double tamanho_cidade;
    protected boolean append = true;

    //private CidadeMapaRivendel cidadeMapaRivendel;
    public CidadeMapa(String nomeLocal, String tipo_local, String dono_local,
            int qtd_lagos, int qtd_pontes, int qtd_habitantes, double tamanho_cidade, double posX, double posY) {
        super(nomeLocal, posX, posY);

        //this.nome_cidade = nome_cidade;
        //this.dono_cidade = dono_cidade;
        this.tipo_local = tipo_local;
        this.dono_local = dono_local;
        this.qtd_lagos = qtd_lagos;
        this.qtd_pontes = qtd_pontes;
        this.qtd_habitantes = qtd_habitantes;
        this.tamanho_cidade = tamanho_cidade;

        //cidadeMapaRivendel = new CidadeMapaRivendel();
    }

    @Override
    public String toString() {
        //return null;
        return nomeLocal + "," + tipo_local + "," + dono_local + "," + qtd_lagos + "," + qtd_pontes + "," + qtd_habitantes + "," + tamanho_cidade + "," + posX + "," + posY;

    }

    protected String nomeArqTemplate = "test\\template.txt";

    @Override
    public void salvarLocal(FileWriter fw) {

        try {
            fw.write(this.nomeLocal + ","
                    + this.tipo_local + ","
                    + this.dono_local + ","
                    + this.qtd_lagos + ","
                    + this.qtd_pontes + ","
                    + this.qtd_habitantes + ","
                    + this.tamanho_cidade + ","
                    + this.posX + ","
                    + this.posY
                    + "\r\n");
            out.println("Registro foi gravado com sucesso no arquivo zoid.txt");
        } catch (IOException ex) {

        }

    }

    public void salvarLocal() {

        FileWriter fw;
        try {
            fw = new FileWriter(nomeArqTemplate, this.append);
            fw.write(this.nomeLocal + ","
                    + this.tipo_local + ","
                    + this.dono_local + ","
                    + this.qtd_lagos + ","
                    + this.qtd_pontes + ","
                    + this.qtd_habitantes + ","
                    + this.tamanho_cidade + ","
                    + this.posX + ","
                    + this.posY
                    + "\r\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CidadeMapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean carregaLocal(BufferedReader br) {
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

    public void carregaLocal(String linha) {
        try {

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
        } catch (Exception e) {
            System.out.println("Erro ao carregar o arquivo =" + e);
        }
    }

    public void carregaLocal() {
        try {
            FileReader fr = new FileReader(this.nomeArqTemplate);
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();

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

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro carregar o arquivo =" + e);
        }
    }

}
