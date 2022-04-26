/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package as.view;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Miroslav
 */
public class Vozilo extends javax.swing.JFrame {

    /**
     * Creates new form Vozilo
     */
    public Vozilo() {
        initComponents();
    }
    private void ucitaj(){
        DefaultListModel<Vozilo> m = new DefaultListModel<>();
        List<Vozilo> entiteti;
        for(Vozilo v : entiteti){
            m.addElement(v);
        }
        lstEntiteti.setModel(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSasija = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtReg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVlasnik = new javax.swing.JTextField();
        btnIzmjeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstEntiteti);

        btnDodaj.setText("Dodaj");

        btnObrisi.setText("Obriši");

        jLabel1.setText("Broj šasije");

        jLabel2.setText("Registracija");

        jLabel3.setText("Vlasnik");

        btnIzmjeni.setText("Izmjeni");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtSasija, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIzmjeni)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSasija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnIzmjeni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmjeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstEntiteti;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtSasija;
    private javax.swing.JTextField txtVlasnik;
    // End of variables declaration//GEN-END:variables
}
