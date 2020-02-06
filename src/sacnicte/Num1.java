/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacnicte;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author blanc
 */
public class Num1 extends javax.swing.JFrame {
DefaultMutableTreeNode mainNode= new DefaultMutableTreeNode("categories");
DefaultMutableTreeNode mainNode2= new DefaultMutableTreeNode("Abecedario");
    /**
     * Creates new form Num1
     */
    public Num1() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTree1.setModel(loadTree());
        jTree2.setModel(loadTree2());
    }

    public DefaultTreeModel loadTree(){
        DefaultMutableTreeNode action= new DefaultMutableTreeNode("action");
        DefaultMutableTreeNode horror= new DefaultMutableTreeNode("horror");
        DefaultMutableTreeNode comedy= new DefaultMutableTreeNode("comedy");
        
        mainNode.add(action);
        mainNode.add(horror);
        mainNode.add(comedy);
        
        DefaultMutableTreeNode comedy1= new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode comedy2= new DefaultMutableTreeNode("B");
        
        action.add(comedy1);
        action.add(comedy2);
        
        DefaultTreeModel model = new DefaultTreeModel(mainNode);
        return model;
    }
    
    public DefaultTreeModel loadTree2(){
        DefaultMutableTreeNode n1= new DefaultMutableTreeNode("a");
        DefaultMutableTreeNode n2= new DefaultMutableTreeNode("b");
        DefaultMutableTreeNode n3= new DefaultMutableTreeNode("c");
        DefaultMutableTreeNode n4= new DefaultMutableTreeNode("d");
        DefaultMutableTreeNode n5= new DefaultMutableTreeNode("e");
        DefaultMutableTreeNode n6= new DefaultMutableTreeNode("f");
        DefaultMutableTreeNode n7= new DefaultMutableTreeNode("g");
        DefaultMutableTreeNode n8= new DefaultMutableTreeNode("h");
        DefaultMutableTreeNode n9= new DefaultMutableTreeNode("i");
        DefaultMutableTreeNode n10= new DefaultMutableTreeNode("j");
        DefaultMutableTreeNode n11= new DefaultMutableTreeNode("k");
        DefaultMutableTreeNode n12= new DefaultMutableTreeNode("l");
        DefaultMutableTreeNode n13= new DefaultMutableTreeNode("m");
        DefaultMutableTreeNode n14= new DefaultMutableTreeNode("n");
        DefaultMutableTreeNode n15= new DefaultMutableTreeNode("ñ");
        DefaultMutableTreeNode n16= new DefaultMutableTreeNode("o");
        DefaultMutableTreeNode n17= new DefaultMutableTreeNode("p");
        DefaultMutableTreeNode n18= new DefaultMutableTreeNode("q");
        DefaultMutableTreeNode n19= new DefaultMutableTreeNode("r");
        DefaultMutableTreeNode n20= new DefaultMutableTreeNode("s");
        DefaultMutableTreeNode n21= new DefaultMutableTreeNode("t");
        DefaultMutableTreeNode n22= new DefaultMutableTreeNode("u");
        DefaultMutableTreeNode n23= new DefaultMutableTreeNode("v");
        DefaultMutableTreeNode n24= new DefaultMutableTreeNode("w");
        DefaultMutableTreeNode n25= new DefaultMutableTreeNode("x");
        DefaultMutableTreeNode n26= new DefaultMutableTreeNode("y");
        DefaultMutableTreeNode n27= new DefaultMutableTreeNode("z");
        
        mainNode2.add(n1);
        mainNode2.add(n2);
        mainNode2.add(n3);
        mainNode2.add(n4);
        mainNode2.add(n5);
        mainNode2.add(n6);
        mainNode2.add(n7);
        mainNode2.add(n8);
        mainNode2.add(n9);
        mainNode2.add(n10);
        mainNode2.add(n11);
        mainNode2.add(n12);
        mainNode2.add(n13);
        mainNode2.add(n14);
        mainNode2.add(n15);
        mainNode2.add(n16);
        mainNode2.add(n17);
        mainNode2.add(n18);
        mainNode2.add(n19);
        mainNode2.add(n20);
        mainNode2.add(n21);
        mainNode2.add(n22);
        mainNode2.add(n23);
        mainNode2.add(n24);
        mainNode2.add(n25);
        mainNode2.add(n26);
        mainNode2.add(n27);
        String l=jTextField2.getText();
        if (l.startsWith("a")) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(l);
//         model2.insertNodeInto(node, mainNode, 0);
         
        }else if(l.startsWith("b")){
            
        }else if(l.startsWith("c")){
        }else if(l.startsWith("d")){
        }else if(l.startsWith("e")){
        }else if(l.startsWith("f")){
        }else if(l.startsWith("g")){
        }else if(l.startsWith("h")){
        }else if(l.startsWith("i")){
        }else if(l.startsWith("j")){
        }else if(l.startsWith("k")){
        }else if(l.startsWith("l")){
        }else if(l.startsWith("m")){
        }else if(l.startsWith("n")){
        }else if(l.startsWith("ñ")){
        }else if(l.startsWith("o")){
        }else if(l.startsWith("p")){
        }else if(l.startsWith("q")){
        }else if(l.startsWith("r")){
        }else if(l.startsWith("s")){
        }else if(l.startsWith("t")){
        }else if(l.startsWith("u")){
        }else if(l.startsWith("v")){
        }else if(l.startsWith("w")){
        }else if(l.startsWith("x")){
        }else if(l.startsWith("y")){
        }else if(l.startsWith("z")){
        
    }
        
//        DefaultMutableTreeNode comedy1= new DefaultMutableTreeNode("A");
//        DefaultMutableTreeNode comedy2= new DefaultMutableTreeNode("B");
//        
//        action.add(comedy1);
//        action.add(comedy2);
        
        DefaultTreeModel model = new DefaultTreeModel(mainNode2);
        return model;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("sports");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 0, 153));

        jScrollPane2.setViewportView(jTree2);

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(0, 144, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addCategory();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
         addName();
    }//GEN-LAST:event_jButton2ActionPerformed
public void addName(){
        DefaultTreeModel model2 = (DefaultTreeModel) jTree2.getModel();
        
        
    }
    
    
    public void addCategory(){
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        String category=jTextField1.getText();
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(category);
         model.insertNodeInto(node, mainNode, 0);
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
            java.util.logging.Logger.getLogger(Num1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Num1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Num1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Num1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Num1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables
}
