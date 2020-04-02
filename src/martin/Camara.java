/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martin;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;
import com.github.sarxos.webcam.WebcamUtils;
import com.github.sarxos.webcam.util.ImageUtils;
import com.sun.imageio.plugins.common.ImageUtil;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MartinPC
 */
public class Camara extends javax.swing.JFrame implements Runnable,WebcamListener,WindowListener,Thread.UncaughtExceptionHandler,ItemListener,WebcamDiscoveryListener{
private static final long  serialVersionUID=1L;
private Webcam webcam=null;
private WebcamPanel webcampanel=null;
private WebcamPicker picker=null;


    /**
     * Creates new form Camara
     */
    public Camara() {
        initComponents();
        run();
    }

    
    void restartCamera(JPanel jpanel, WebcamPanel webcampanel){
        if (webcam.isOpen()) {
            webcampanel.setFillArea(false);
            webcampanel.setFPSDisplayed(true);
            webcampanel.setDisplayDebugInfo(true);
            webcampanel.setImageSizeDisplayed(true);
            webcampanel.setMirrored(false);
            webcampanel.resume();
        }else{
            startCamera();
        }
        
    }
    
    
    void takePicture(){
        WebcamUtils.capture(webcam, "C:\\Users\\MartinPC\\Desktop\\img",ImageUtils.FORMAT_PNG);
        webcampanel.stop();
        jPanel1.removeAll();
        ImageIcon imageicon=new ImageIcon("C:\\Users\\MartinPC\\Desktop\\img.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(jPanel1.getWidth(),jPanel1.getHeight(), Image.SCALE_DEFAULT));
        JLabel jLabel = new JLabel();
        jLabel.setSize(500,500);
        jLabel.setIcon(icon);
        jPanel1.add(jLabel);
        jPanel1.revalidate();
        jPanel1.repaint();
        
        
    }
    
    
    void startCamera(){
        webcam=picker.getSelectedWebcam();
        if (webcam==null) {
            System.out.println("no hay camara");
            System.exit(1);
        }
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.addWebcamListener(this);
        System.out.println("selected "+webcam.getName());
        
        webcampanel=new WebcamPanel(webcam,new Dimension(500,500),false);
        webcampanel.setFPSDisplayed(true);
        jPanel1.removeAll();
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(webcampanel,BorderLayout.CENTER);
        pack();
        setVisible(true);
        Thread t =new Thread(){
            @Override
            public void run(){
                webcampanel.start();
            }
        };
        t.setName("example-starter");
        t.setDaemon(true);
        t.setUncaughtExceptionHandler(this);
        t.start();
                
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("take");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Take Again");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        webcampanel.pause();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        takePicture();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        restartCamera(jPanel1, webcampanel);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Camara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Camara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Camara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Camara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Camara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        setLayout(new BorderLayout());
        addWindowListener(this);
        picker=new WebcamPicker();
        picker.addItemListener(this);
        add(picker,BorderLayout.NORTH);
        add(jPanel1,BorderLayout.CENTER);
        add(jButton1,BorderLayout.EAST);
        add(jButton2,BorderLayout.WEST);
        add(jButton3,BorderLayout.SOUTH);
        startCamera();
    }

    @Override
    public void webcamOpen(WebcamEvent we) {
      
    }

    @Override
    public void webcamClosed(WebcamEvent we) {
      
    }

    @Override
    public void webcamDisposed(WebcamEvent we) {
    }

    @Override
    public void webcamImageObtained(WebcamEvent we) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    @Override
    public void webcamFound(WebcamDiscoveryEvent wde) {
    }

    @Override
    public void webcamGone(WebcamDiscoveryEvent wde) {
    }
}
