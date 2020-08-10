import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * calamities.java
 *
 * Created on Sep 28, 2017, 11:29:44 AM
 */

/**
 *
 * @author Abhinav
 */
public class calamities extends javax.swing.JFrame {

    /** Creates new form calamities */
    public calamities() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 750));
        getContentPane().setLayout(null);

        jList1.setBackground(new java.awt.Color(0, 255, 0));
        jList1.setFont(new java.awt.Font("High Tower Text", 1, 16));
        jList1.setForeground(new java.awt.Color(102, 0, 102));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Select The Type of Contribution", "Earthquake", "Flood", "Poverty", "Martyred" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 240, 270, 140);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jComboBox1.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the form of Help", "Donate", "Phy. Assist", "Goods" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 430, 200, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 20));
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Assist");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 10, 110, 30);

        jLabel2.setText("Select Region");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 60, 160, 40);

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox1.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox1.setText("J&K");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(690, 110, 70, 31);

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox2.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox2.setText("PB");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(700, 200, 80, 31);

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox3.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox3.setText("HP");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(740, 170, 90, 31);

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox4.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox4.setText("UK");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(790, 210, 90, 31);

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox5.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox5.setText("HR");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(720, 240, 90, 31);

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox6.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox6.setText("RJ");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(640, 290, 90, 31);

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox7.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox7.setText("UP");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(780, 290, 80, 31);

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox8.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox8.setText("BH");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(900, 320, 70, 31);

        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox9.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox9.setText("GJ");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox9);
        jCheckBox9.setBounds(600, 370, 90, 31);

        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox10.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox10.setText("MP");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox10);
        jCheckBox10.setBounds(740, 380, 90, 31);

        buttonGroup1.add(jCheckBox11);
        jCheckBox11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox11.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox11.setText("CT");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox11);
        jCheckBox11.setBounds(830, 410, 70, 31);

        buttonGroup1.add(jCheckBox12);
        jCheckBox12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox12.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox12.setText("NE");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox12);
        jCheckBox12.setBounds(1050, 320, 70, 31);

        buttonGroup1.add(jCheckBox13);
        jCheckBox13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox13.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox13.setText("AP");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox13);
        jCheckBox13.setBounds(780, 550, 70, 31);

        buttonGroup1.add(jCheckBox14);
        jCheckBox14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox14.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox14.setText("MH");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox14);
        jCheckBox14.setBounds(680, 470, 90, 31);

        buttonGroup1.add(jCheckBox15);
        jCheckBox15.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox15.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox15.setText("TL");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox15);
        jCheckBox15.setBounds(760, 510, 80, 31);

        buttonGroup1.add(jCheckBox16);
        jCheckBox16.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox16.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox16.setText("KN");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox16);
        jCheckBox16.setBounds(700, 570, 80, 31);

        buttonGroup1.add(jCheckBox18);
        jCheckBox18.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox18.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox18.setText("KR");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox18);
        jCheckBox18.setBounds(730, 680, 70, 31);

        buttonGroup1.add(jCheckBox19);
        jCheckBox19.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox19.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox19.setText("TN");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox19);
        jCheckBox19.setBounds(770, 630, 70, 31);

        buttonGroup1.add(jCheckBox20);
        jCheckBox20.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox20.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox20.setText("OD");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox20);
        jCheckBox20.setBounds(960, 390, 80, 31);

        buttonGroup1.add(jCheckBox21);
        jCheckBox21.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox21.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox21.setText("WB");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox21);
        jCheckBox21.setBounds(890, 450, 70, 31);

        buttonGroup1.add(jCheckBox22);
        jCheckBox22.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16));
        jCheckBox22.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox22.setText("JR");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox22);
        jCheckBox22.setBounds(910, 370, 70, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (37).png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 70, 620, 640);

        jButton1.setFont(new java.awt.Font("Aharoni", 1, 14));
        jButton1.setText("PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 590, 150, 23);

        jTextField1.setBackground(new java.awt.Color(0, 51, 153));
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Aharoni", 1, 18));
        jTextField1.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 20, 190, 40);

        jTextField2.setBackground(new java.awt.Color(51, 255, 0));
        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField2.setText("Input the amt. of donation");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(290, 430, 200, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Log Out !");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1073, 0, 120, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alpha_istanbul.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1190, 760);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1205)/2, (screenSize.height-800)/2, 1205, 800);
    }// </editor-fold>//GEN-END:initComponents
String region;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String need,type;
String a=jTextField1.getText();
need=(String) jList1.getSelectedValue();
type=(String) jComboBox1.getSelectedItem();

        try{
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pukar","root","root");
Statement stmt= con.createStatement();
String query="update users set NEED='"+need+"',TYPE='"+type+"',REGION='"+region+"' where username='"+a+"';";
int rs= stmt.executeUpdate(query);
}catch(Exception e){
System.out.println(e);
}
if (type.equals("PhyAssist")){
JOptionPane.showMessageDialog(null,"<html>We will be in contact with you through your mail.<br>THANK YOU FOR BEING WITH US!</html>");
}
else if (type.equals("Goods")){
JOptionPane.showMessageDialog(null,"<html>Our service Transport will arrive within 5 days.<br>THANK YOU FOR BEING WITH US!</html>");
}
else if (type.equals("Donate")){
JOptionPane.showMessageDialog(null,"Redirecting to Payment Gateway");
pay b=new pay();
b.setVisible(true);
this.dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
region="J&K";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
region="HP";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
region="PB";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
region="UK";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
region="HR";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
region="RJ";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
region="UP";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
region="GJ";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
region="MP";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
region="CT";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
region="BH";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
region="NE";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
region="OD";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
region="JR";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
region="MH";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
region="TL";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
region="KN";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
region="AP";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
region="KR";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
region="TN";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
region="WB";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String type=(String) jComboBox1.getSelectedItem();
if (type.equals("Donate")){
jTextField2.setEditable(true);
}
else{
jTextField2.setEditable(false);
}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
login a=new login();
a.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
