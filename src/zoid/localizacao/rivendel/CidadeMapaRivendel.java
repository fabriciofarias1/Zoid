/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao.rivendel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import zoid.localizacao.CidadeMapa;
import zoid.localizacao.rivendel.CidadeMapaView;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author Fabricio
 */
public class CidadeMapaRivendel {

    private ArrayList<CidadeMapa> listaCidades;
    private ArrayList<CidadeMapaTemplate> listaCidadesTemlate;

    private CidadeMapaView viewC;
    protected String nomeArq = "C:\\Zoid\\zoid.txt";
    protected String nomeArqTemplate = "test\\template.txt";
    private javax.swing.JTextField Nome_Cidade_jtxt;
    private javax.swing.JTextField Dono_local_jtxt;
    private javax.swing.JTextField posX_jtxt;
    private javax.swing.JTextField posY_jtxt;
    private javax.swing.JTextField qtd_habitantes_jtxt;
    private javax.swing.JTextField qtd_lagos_jtxt;
    private javax.swing.JTextField qtd_pontes_jtxt;
    private javax.swing.JTextField tamanho_cidade_jtxt;
    private javax.swing.JTextField tipo_local_jtxt;

    public CidadeMapaRivendel() {

        viewC = new CidadeMapaView();
        listaCidades = new ArrayList<CidadeMapa>();
        listaCidadesTemlate = new ArrayList<CidadeMapaTemplate>();
        viewC.setListenerInserir(new CidadeMapaRivendel.InserirListener());
        viewC.setListenerSalvar(new CidadeMapaRivendel.SalvarListener());
        viewC.setListenerCarregar(new CidadeMapaRivendel.CarregarListener());
        viewC.setLimpar(new CidadeMapaRivendel.Limpar());
        viewC.setCarregardaLista(new CidadeMapaRivendel.CarregarLista());

    }

    public void iniciarCidadeRivendel() {
        viewC.setVisible(true);
    }

    public class CarregarLista implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Teste");
            int index = viewC.getjList1().getSelectedIndex();
//            System.out.println(viewC.getjList1().getSelectedValue().toString());

            String selected = viewC.getjList1().getSelectedValuesList().toString();
            System.out.println(selected);

            String testoreplace = selected.replace("[", "").replace("]", "");

            String texto[] = testoreplace.split(",");

            viewC.setNome_Cidade_jtxt(texto[0]);
            viewC.setDono_local_jtxt(texto[1]);
            viewC.setTipo_local_jtxt(texto[2]);
            viewC.setQtd_lagos_jtxt(texto[3]);
            viewC.setQtd_pontes_jtxt(texto[4]);
            viewC.setQtd_habitantes_jtxt(texto[5]);
            viewC.setTamanho_cidade_jtxt(texto[6]);
            viewC.setPosX_jtxt(texto[7]);
            viewC.setPosY_jtxt(texto[8]);

        }

        @Override
        public void mousePressed(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public class CarregarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            //try {
            viewC.limparLista();
            listaCidades.clear();

            FileReader fr = null;
            try {
                fr = new FileReader(nomeArqTemplate);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            CidadeMapaTemplate f = new CidadeMapaTemplate(nomeArq, nomeArq, nomeArq, 0, 0, 0, 0, 0, 0);

            //viewC.setNome_Cidade_jtxt(Nome_Cidade_jtxt);
            //viewC.setDono_local_jtxt(Dono_local_jtxt);
//            viewC.setTipo_local_jtxt(tipo_local_jtxt);
//            viewC.setQtd_lagos_jtxt(qtd_lagos_jtxt);
//            viewC.setQtd_pontes_jtxt(qtd_pontes_jtxt);
//            viewC.setQtd_habitantes_jtxt(qtd_habitantes_jtxt);
//            viewC.setTamanho_cidade_jtxt(tamanho_cidade_jtxt);
//            viewC.setPosX_jtxt(posX_jtxt);
//            viewC.setPosY_jtxt(posY_jtxt);
            boolean linhaLida = f.carregaLocal(br);
            while (linhaLida) {
                listaCidadesTemlate.add(f);
                viewC.addElementoLista(f);
                f = new CidadeMapaTemplate();
                linhaLida = f.carregaLocal(br);

            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public class InserirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent b) {
            try {
                String nomeLocal = viewC.getNome_Cidade_jtxt();
                String tipo_local = viewC.getTipo_local_jtxt();
                String dono_local = viewC.getDono_local_jtxt();
                int qtd_lagos = viewC.getQtd_lagos_jtxt();
                int qtd_pontes = viewC.getQtd_pontes_jtxt();
                int qtd_habitantes = viewC.getQtd_habitantes_jtxt();
                Double tamanho_cidade = viewC.getTamanho_cidade_jtxt();
                Double posX = viewC.getPosX_jtxt();
                Double posY = viewC.getPosY_jtxt();

                CidadeMapa f = new CidadeMapa(nomeLocal, tipo_local, dono_local, qtd_lagos, qtd_pontes, qtd_habitantes, tamanho_cidade, posX, posY);
                listaCidades.add(f);
                ///--------------------///
                viewC.addElementoLista(f);
                ///--------------------///
            } catch (Exception e) {
                System.out.println(e);

                JOptionPane.showMessageDialog(viewC, "Todos os campos são obrigatorios.");
            }

        }

    }

    public class SalvarListener implements ActionListener {

        protected boolean append = true;

        @Override
        public void actionPerformed(ActionEvent c) {
            try {
                //------------------//

                FileWriter fw = new FileWriter(nomeArqTemplate, append);
                Iterator<CidadeMapa> it = listaCidades.iterator();
                while (it.hasNext()) {
                    CidadeMapa f = it.next();
                    //------------------//
                    f.salvarLocal(fw);
                    //------------------//                
                }
                fw.close();
            } catch (IOException ex) {

            }
        }
    }

    public class Limpar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent d) {

            viewC.limpar();
        }
    }

}
