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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import zoid.localizacao.CidadeMapa;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */
public class CidadeMapaRivendel {

    private final ArrayList<CidadeMapa> listaCidades;
    private final CidadeMapaView viewC;
    protected String nomeArq = "test\\zoid.txt";

    public CidadeMapaRivendel() {

        viewC = new CidadeMapaView();
        listaCidades = new ArrayList<>();
        viewC.setListenerInserir(new CidadeMapaRivendel.InserirListener());
        viewC.setListenerSalvar(new CidadeMapaRivendel.SalvarListener());
        viewC.setListenerCarregar(new CidadeMapaRivendel.CarregarListener());
        viewC.setLimpar(new CidadeMapaRivendel.Limpar());
        viewC.setCarregardaLista(new CidadeMapaRivendel.CarregarLista());
        viewC.setListenerDeletar(new CidadeMapaRivendel.DeletarListener());

    }

    public void iniciarCidadeRivendel() {
        viewC.setVisible(true);
    }

    public class CarregarLista implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            String selected = viewC.getjList1().getSelectedValuesList().toString();
            String testoreplace = selected.replace("[", "").replace("]", "");
            String texto[] = testoreplace.split(",");

            viewC.setNome_Cidade_jtxt(texto[0]);
            viewC.setTipo_local_jtxt(texto[1]);
            viewC.setDono_local_jtxt(texto[2]);
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

    public void Carregar() {

        viewC.limparLista();
        listaCidades.clear();

        FileReader fr = null;
        try {
            fr = new FileReader(nomeArq);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        CidadeMapa f = new CidadeMapa(nomeArq, nomeArq, nomeArq, 0, 0, 0, 0, 0, 0);

        boolean linhaLida = f.carregaLocal(br);
        while (linhaLida) {
            listaCidades.add(f);
            viewC.addElementoLista(f);
            f = new CidadeMapa(nomeArq, nomeArq, nomeArq, 0, 0, 0, 0, 0, 0);
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

    public class CarregarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {

            viewC.limparLista();
            listaCidades.clear();

            FileReader fr = null;
            try {
                fr = new FileReader(nomeArq);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            CidadeMapa f = new CidadeMapa(nomeArq, nomeArq, nomeArq, 0, 0, 0, 0, 0, 0);

            boolean linhaLida = f.carregaLocal(br);
            while (linhaLida) {
                listaCidades.add(f);
                viewC.addElementoLista(f);
                f = new CidadeMapa(nomeArq, nomeArq, nomeArq, 0, 0, 0, 0, 0, 0);
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

        @Override
        public void actionPerformed(ActionEvent c) {

            try {
                //------------------//

                FileWriter fw = new FileWriter(nomeArq);
                Iterator<CidadeMapa> it = listaCidades.iterator();
                while (it.hasNext()) {
                    CidadeMapa f = it.next();
                    //------------------//
                    f.salvarLocal(fw);
                    //------------------//                
                }
                fw.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(viewC, "Falha ao salvar o arquivo.");
            }
        }
    }

    public class Limpar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent d) {

            viewC.limpar();
        }
    }

    public class DeletarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent d) {

            DefaultListModel model = (DefaultListModel) viewC.getjList1().getModel();
            int selectedIndex = viewC.getjList1().getSelectedIndex();
            if (selectedIndex != -1) {
                model.remove(selectedIndex);
                int i = 0;
                try {

                    Object texto[] = model.toArray();

                    try (FileWriter writer = new FileWriter(nomeArq)) {
                        while (i < viewC.getjList1().getModel().getSize()) {

                            String line = texto[i].toString();
                            String replace = line.replace("[", "").replace("]", "");
                            writer.write(replace + "\r\n");
                            i++;
                        }
                    }
                    listaCidades.clear();
                    Carregar();

                } catch (IOException ex) {
                    Logger.getLogger(CidadeMapaRivendel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

}
