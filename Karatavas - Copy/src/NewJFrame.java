import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NewJFrame extends javax.swing.JFrame {
    private String vards = "pasaka";
    private String minejums;
    private int kludas = 0;

private HangmanPanel hangmanPanel;

    public NewJFrame() {
        initComponents();
        initializeGame();
    }

    private void initializeGame() {
        minejums = svitras(vards);
        updateWordDisplay();
        hangmanPanel.reset();
    }

    public String svitras(String s) {
        StringBuilder svitrasBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            svitrasBuilder.append("-");
        }
        return svitrasBuilder.toString();
    }

    public String aizvieto(String s, String v, char b) {
        StringBuilder aizvietots = new StringBuilder(s);
        for (int i = 0; i < v.length(); i++) {
            if (v.charAt(i) == b) {
                aizvietots.setCharAt(i, b);
            }
        }
        return aizvietots.toString();
    }

        private void zimet(int kludas) {
        // Implement your drawing logic here if needed
    }

    private void checkGuess(char burts) {
        if (vards.contains(String.valueOf(burts))) {
            minejums = aizvieto(vards, minejums, burts);
            updateWordDisplay();

            if (vards.equals(minejums)) {
                uzvara();
                initializeGame();
            }
        } else {
            kludas++;
            zimet(kludas);

            if (kludas == 10) {
                zaudet();
                initializeGame();
            }
        }
    }

    private void updateWordDisplay() {
        WordDisplay.setText(minejums);
        hangmanPanel.reset();
    }

    private void uzvara() {
        JOptionPane.showMessageDialog(this, "Uzvara!");
        // Implement any additional logic for winning
    }

    private void zaudet() {
        JOptionPane.showMessageDialog(this, "Zaudējums! Vārds bija: " + vards);
        // Implement any additional logic for losing
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zimejums = new javax.swing.JPanel();
        ievade = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        WordDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 650));

        javax.swing.GroupLayout zimejumsLayout = new javax.swing.GroupLayout(zimejums);
        zimejums.setLayout(zimejumsLayout);
        zimejumsLayout.setHorizontalGroup(
            zimejumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        zimejumsLayout.setVerticalGroup(
            zimejumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ievade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ievadeActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel1.setText("Karatavas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ievade, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zimejums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(zimejums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(WordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ievade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ievadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ievadeActionPerformed
    }//GEN-LAST:event_ievadeActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        char burts = ievade.getText().charAt(0); // Get the first character
        if (Character.isLetter(burts)) {
            checkGuess(burts);
        } else {
            JOptionPane.showMessageDialog(this, "Lūdzu ievadiet derīgu burtu.");
        }
        ievade.setText("");
    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        initializeGame();
    }//GEN-LAST:event_ResetActionPerformed
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField WordDisplay;
    private javax.swing.JTextField ievade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel zimejums;
    // End of variables declaration//GEN-END:variables
private class HangmanPanel extends JPanel {
     private int partsToDraw = 0;

        public void reset() {
            partsToDraw = 0;
            repaint();
        }

        public void drawNextPart() {
            partsToDraw++;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int width = getWidth();
            int height = getHeight();

            g.setColor(Color.BLACK);

            switch (partsToDraw) {
                case 1:
                    g.drawOval(width / 2 - 30, 30, 60, 60);
                    break;
                case 2:
                    g.drawLine(width / 2, 90, width / 2, 220);
                    break;
                case 3:
                    g.drawLine(width / 2, 100, width / 2 - 30, 160);
                    break;
                case 4:
                    g.drawLine(width / 2, 100, width / 2 + 30, 160);
                    break;
                case 5:
                    g.drawLine(width / 2, 220, width / 2 - 30, 280);
                    break;
                case 6:
                    g.drawLine(width / 2, 220, width / 2 + 30, 280);
                    break;
            }
        }
    }
}