
import java.awt.Choice;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchBy.java
 *
 * Created on Sep 7, 2014, 9:10:10 AM
 */
/**
 *
 * @author Sir
 */
public class SearrchByGroup extends javax.swing.JFrame{

    String itemname,itemvalue;
    /** Creates new form SearchBy */
    public SearrchByGroup() {
        initComponents();
        setSize(250,210);
     setLocationRelativeTo(this);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        choice1.add("Select");
        choice1.add("friend");
        choice1.add("family");
        choice1.add( "business");
        choice1.add("co-worker");
        choice1.add("collegue");
         choice1.add("school");
          choice1.add("other");
     //   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       
        
        // "friend", "family", "business", "co-worker","collegue","school"
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("DISPLAY GROUP");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 190, 18);

        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 229, 144);

        choice1.setName("choice1"); // NOI18N
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });
        getContentPane().add(choice1);
        choice1.setBounds(0, 150, 230, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
         //Choice c=(Choice)evt.getSource();
         //itemname=c.getSelectedItem();
        itemname=((Choice)evt.getSource()).getSelectedItem();
        System.out.println("u have selected:"+itemname);
        try {
            new DisplayGroupContactTable(itemname).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearrchByGroup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SearrchByGroup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SearrchByGroup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SearrchByGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choice1ItemStateChanged

    /**
     * @param args the command line arguments
  /*   */
 /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearrchByGroup().setVisible(true);
            }
        });
    } */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}