/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

import javax.swing.JFrame;

/**
 *
 * @author SasGyula(SZOFT_2023_
 */
public class jatek extends javax.swing.JFrame {

    /**
     * Creates new form jatek
     */
    public jatek() {
        initComponents();
        lblArany1.setVisible(false);
        lblArany2.setVisible(false);
        lblArany3.setVisible(false);
        lblArany4.setVisible(false);
        lblArany5.setVisible(false);
        lblArany6.setVisible(false);
        lblArany7.setVisible(false);
        lblArany8.setVisible(false);
        lblHp1.setVisible(false);
        lblHp2.setVisible(false);
        lblHp3.setVisible(false);
        
        txfSz.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, kattints a 'Nyisd ki a doboz' gombra. Ha inkább tovább haladsz észak felé, kattints az 'Észak felé' gombra!");
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
        txfSz = new javax.swing.JTextArea();
        lblEletero = new javax.swing.JLabel();
        lblSzerencse = new javax.swing.JLabel();
        lblUgyesseg = new javax.swing.JLabel();
        lblArany = new javax.swing.JLabel();
        lblLc1 = new javax.swing.JLabel();
        lblHp1 = new javax.swing.JLabel();
        btnBal = new javax.swing.JButton();
        btnJobb = new javax.swing.JButton();
        lblHp2 = new javax.swing.JLabel();
        lblHp3 = new javax.swing.JLabel();
        lblHp4 = new javax.swing.JLabel();
        lblHp5 = new javax.swing.JLabel();
        lblHp6 = new javax.swing.JLabel();
        lblHp7 = new javax.swing.JLabel();
        lblHp8 = new javax.swing.JLabel();
        lblLc2 = new javax.swing.JLabel();
        lblLc3 = new javax.swing.JLabel();
        lblLc4 = new javax.swing.JLabel();
        lblLc5 = new javax.swing.JLabel();
        lblLc6 = new javax.swing.JLabel();
        lblLc7 = new javax.swing.JLabel();
        lblLc8 = new javax.swing.JLabel();
        lblUgy1 = new javax.swing.JLabel();
        lblUgy2 = new javax.swing.JLabel();
        lblUgy3 = new javax.swing.JLabel();
        lblUgy4 = new javax.swing.JLabel();
        lblUgy5 = new javax.swing.JLabel();
        lblUgy6 = new javax.swing.JLabel();
        lblUgy7 = new javax.swing.JLabel();
        lblUgy8 = new javax.swing.JLabel();
        lblArany1 = new javax.swing.JLabel();
        lblArany2 = new javax.swing.JLabel();
        lblArany3 = new javax.swing.JLabel();
        lblArany4 = new javax.swing.JLabel();
        lblArany5 = new javax.swing.JLabel();
        lblArany6 = new javax.swing.JLabel();
        lblArany7 = new javax.swing.JLabel();
        lblArany8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfSz.setColumns(20);
        txfSz.setLineWrap(true);
        txfSz.setRows(5);
        txfSz.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txfSz);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 270, 150));

        lblEletero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEletero.setForeground(new java.awt.Color(255, 255, 255));
        lblEletero.setText("Életerő");
        getContentPane().add(lblEletero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblSzerencse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSzerencse.setForeground(new java.awt.Color(255, 255, 255));
        lblSzerencse.setText("Szerencse");
        getContentPane().add(lblSzerencse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 27));

        lblUgyesseg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUgyesseg.setForeground(new java.awt.Color(255, 255, 255));
        lblUgyesseg.setText("Ügyesség");
        getContentPane().add(lblUgyesseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblArany.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblArany.setForeground(new java.awt.Color(255, 255, 255));
        lblArany.setText("Arany");
        getContentPane().add(lblArany, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblLc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblHp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btnBal.setText("Nyisd ki a dobozt");
        btnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnJobb.setText("Észak felé");
        btnJobb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobbActionPerformed(evt);
            }
        });
        getContentPane().add(btnJobb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        lblHp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblHp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        lblHp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblHp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        lblHp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lblHp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lblHp8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hp.png"))); // NOI18N
        getContentPane().add(lblHp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lblLc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        lblLc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblLc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lblLc5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        lblLc6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        lblLc7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        lblLc8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/szerencse.png"))); // NOI18N
        getContentPane().add(lblLc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        lblUgy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblUgy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lblUgy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        lblUgy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lblUgy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        lblUgy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        lblUgy7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        lblUgy8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/ugyesseg1.png"))); // NOI18N
        getContentPane().add(lblUgy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        lblArany1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lblArany2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        lblArany3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        lblArany4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblArany5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        lblArany6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lblArany7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        lblArany8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/arany.png"))); // NOI18N
        getContentPane().add(lblArany8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/hatter3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJobbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobbActionPerformed
        kettevag();
        nyugatFele();
        nyugat();
        eszakFele();
        harc();
    }//GEN-LAST:event_btnJobbActionPerformed


    private void btnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalActionPerformed
        maszas();
        eszakFeleHarc();
        keletFele();
        nyisdKiADobozt();
        kelet(); 
    }//GEN-LAST:event_btnBalActionPerformed
    private void harc() {
        if (btnJobb.getText() == "Harc") {
            JFrame harc = new harc();
            harc.show();
            
            dispose();
        }
    }
    private void kettevag() {
        if (btnJobb.getText() == "Kettévág"){
            txfSz.setText("Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.");
            lblHp4.setVisible(false);
            lblHp5.setVisible(false);
            btnBal.setText("Kelet felé");
            btnJobb.setVisible(false);
        }
    }
    private void maszas() {
        if (btnBal.getText() == "Mászás"){
            txfSz.setText("Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.");
             btnBal.setText("Kelet felé");
             btnJobb.setVisible(false);
        }
    }
    private void eszakFeleHarc() {
        if (btnBal.getText() == "Észak felé"){
            txfSz.setText("Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.");
            btnBal.setVisible(false);
            btnJobb.setText("Harc");
        }
    }
    private void keletFele() {
        if (btnBal.getText() == "Kelet felé") {
            txfSz.setText("A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, kattints a 'Nyugat felé' gombra. Ha inkább észak felé mész a harmadik pár lábnyom után, kattints a 'Észak felé' gombra.");
            btnJobb.setText("Nyugat felé");
            btnBal.setText("Észak felé");
            btnJobb.setVisible(true);
        }
    }
    private void kelet() {
        if (btnBal.getText() == "Kelet") {
            txfSz.setText("Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, kattints a 'Mászás' gombra. Ha ketté akarod vágni a kardoddal, kattints a 'Kettévág' gombra");
            btnBal.setText("Mászás");
            btnJobb.setText("Kettévág");
        }
    }
    private void nyisdKiADobozt() {
        if (btnBal.getText() == "Nyisd ki a dobozt") {
            txfSz.setText("A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot, apró darabokra téped a pergament, és tovább mész észak felé.");
            btnBal.setVisible(false);
            btnJobb.setText("Észak felé");
            lblArany2.setVisible(true);
            lblArany1.setVisible(true);
        }
    }
    private void nyugat() {
        if (btnJobb.getText() == "Nyugat"){
            txfSz.setText("A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, kattints a 'Nyugat felé' gombra. Ha inkább észak felé mész a harmadik pár lábnyom után, kattints a 'Észak felé' gombra.");
            btnJobb.setText("Nyugat felé");
            btnBal.setText("Észak felé");
        }
    }
    private void eszakFele() {
        if (btnJobb.getText() == "Észak felé"){
            txfSz.setText("Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, kattints a 'Nyugat' gombra. Ha keletnek, kattints a 'Kelet' gombra.");
            btnJobb.setText("Nyugat");
            btnBal.setText("Kelet");
            btnBal.setVisible(true);
        }
    }
    private void nyugatFele() {
        if (btnJobb.getText() == "Nyugat felé"){
            txfSz.setText("Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBal;
    private javax.swing.JButton btnJobb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArany;
    private javax.swing.JLabel lblArany1;
    private javax.swing.JLabel lblArany2;
    private javax.swing.JLabel lblArany3;
    private javax.swing.JLabel lblArany4;
    private javax.swing.JLabel lblArany5;
    private javax.swing.JLabel lblArany6;
    private javax.swing.JLabel lblArany7;
    private javax.swing.JLabel lblArany8;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblHp1;
    private javax.swing.JLabel lblHp2;
    private javax.swing.JLabel lblHp3;
    private javax.swing.JLabel lblHp4;
    private javax.swing.JLabel lblHp5;
    private javax.swing.JLabel lblHp6;
    private javax.swing.JLabel lblHp7;
    private javax.swing.JLabel lblHp8;
    private javax.swing.JLabel lblLc1;
    private javax.swing.JLabel lblLc2;
    private javax.swing.JLabel lblLc3;
    private javax.swing.JLabel lblLc4;
    private javax.swing.JLabel lblLc5;
    private javax.swing.JLabel lblLc6;
    private javax.swing.JLabel lblLc7;
    private javax.swing.JLabel lblLc8;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblUgy1;
    private javax.swing.JLabel lblUgy2;
    private javax.swing.JLabel lblUgy3;
    private javax.swing.JLabel lblUgy4;
    private javax.swing.JLabel lblUgy5;
    private javax.swing.JLabel lblUgy6;
    private javax.swing.JLabel lblUgy7;
    private javax.swing.JLabel lblUgy8;
    private javax.swing.JLabel lblUgyesseg;
    private javax.swing.JTextArea txfSz;
    // End of variables declaration//GEN-END:variables
}
