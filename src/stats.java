/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * stats.java
 *
 * Created on 29 Oct, 2017, 12:04:00 AM
 */

/**
 *
 * @author User
 */
public class stats extends javax.swing.JFrame {

    /** Creates new form stats */
    public stats() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(204, 51, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 15));
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("1) Total of 577 centres are currently fuctioning of pukar all over country.\n2) Staff of around 10000 has been added to the existing staff of 5 Lakh this month.\n3) Immediate action is being taken in the recent tragedy of floods in Bihar,West Bengal and North Eastern States.\n4) Work is underway to launch new mobile app for users benefit and easy access to the pukar.\n5) With your help we have provided basic necessities of life i.e Shelter, food, Clothes to almost 5000 abandoned and poor families.\n6) Moral and financial support is being provided to our brave martyrs' families who have lost their loved ones on the battlefield.\n\nWe appreciate your effort for being a part of pukar and doing something that might help others.\n\nYou can contact us at: \nsharmaab@gmail.com or 8496454395.\nWe would love to answer your query.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 750, 390);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 24));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Statistics (info)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 300, 30);

        jButton2.setText("PROCEED =>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 460, 110, 23);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 490);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-808)/2, (screenSize.height-531)/2, 808, 531);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
jTextArea1.setEditable(false);
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
login a=new login();
a.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}