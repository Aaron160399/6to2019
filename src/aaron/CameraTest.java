/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaron;

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
 * @author Aaron
 */
public class CameraTest extends javax.swing.JFrame implements Runnable, 
        WebcamListener, WindowListener, Thread.UncaughtExceptionHandler, 
        ItemListener, WebcamDiscoveryListener {
    
    //Creamos una variable que indicará la versión del serial
    private static final long serialVersionUID = 1L;
    //Creamos un objeto del tipo Webcam
    private Webcam webcam = null;
    //Creamos un objeto del tipo WebcamPanel, este sirve para contener la cámara
    private WebcamPanel webcamPanel = null;
    /*Creamos un objeto del tipo WebcamPicker, nos permiirá desplegar todas las
    cámaras disponibles para el equipo*/
    private WebcamPicker picker = null;

    /**
     * Creates new form CameraTest
     */
    public CameraTest() {
        initComponents();
        /*Mandamos a llamar el método RUN para que nuestras configuraciones 
        se muestren*/
        run();
    }
    
    void startCamera(){
        //Obtenemos la cámara que está seleccionada
        webcam = picker.getSelectedWebcam();
        /*En caso de no haber cámara seleccionada (o disponibes) mostramos 
        un mensaje*/
        if (webcam == null) {
                System.out.println("No webcams found...");
                System.exit(1);
        }
        /*Establecemos una resolución para la cámara, todo depende de las 
        capacidades de nuestra computadora para la resolución disponibles*/
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.addWebcamListener(this);
        //Sólo por seguridad, obtenemos el nombre de la cámara seleccionada
        System.out.println("selected " + webcam.getName());
        //Agregamos la cámara al panel de cámara
        webcamPanel = new WebcamPanel(webcam, new Dimension(500, 500) ,false);
        webcamPanel.setFPSDisplayed(true);
        //vaciamos de nuevo el panel de nuestra vetana
        //Vaciamos el panel 1. Este panel es el que agregamos en nuestra interfaz
        jPanel1.removeAll();
        //Agregamos un nuevo layout
        jPanel1.setLayout(new FlowLayout());
        //Insertamos la cámara en él
        jPanel1.add(webcamPanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        //Creamos un hilo
        Thread t = new Thread() {

                @Override
                public void run() {
                    //Iniciamos la cámara
                    webcamPanel.start();
                }
        };
        //Agregamos un identificador y otras configuraciones al hilo
        t.setName("example-starter");
        t.setDaemon(true);
        t.setUncaughtExceptionHandler(this);
        t.start();
    }
    
    public void restartCamera(JPanel jPanel, WebcamPanel webcamPanel){
        /*Pregunto si la cámara está abierta, en caso de ser así sólamente
        reinicio la imagen*/
        if (webcam.isOpen()) {
            //Al paner de la cámara le agregamos configuraciones
            //Esta característica permite que se muestren la imagen en todo el panel
            webcamPanel.setFillArea(false);
            //Esta característica permite que se muestren los fotogramas por segundo
            webcamPanel.setFPSDisplayed(true);
            //Esta característica permite mostrar la información de debuggeo
            webcamPanel.setDisplayDebugInfo(true);
            //Esta característica permite mostrar el tamaño de imagen
            webcamPanel.setImageSizeDisplayed(true);
            //Esta característica permite que se tome la visualización como "espejo"
            webcamPanel.setMirrored(false);
            /*Las configuraciones anteriores se pueden omitir. La siguiente 
            línea es la que nos interesa en realidad
            Volvemos a correr la cámara que ya tenemos abierta*/
            webcamPanel.resume();
        } else {
            //Si se ha cerrado la cámara entonces volvemos a crear una
            startCamera();
        }
    }
    
    void takePicture(){
        //Guardamos la foto en una carpeta donde queraos que se guarden las imágenes
        WebcamUtils.capture(webcam, "C:\\Users\\aaron\\Desktop\\Fotos\\img", 
                ImageUtils.FORMAT_PNG);
        //Detenemos la cámara
        webcamPanel.stop();
        //Limpiamos el panel del JFrame
        jPanel1.removeAll();
        //Creamos un nuevo ImageIcon con la foto que acabamos de tomar
        ImageIcon imageIcon = new ImageIcon(
            "C:\\Users\\aaron\\Desktop\\Fotos\\img.png");
        //Creamos un nuevo icono
        Icon icon = new ImageIcon(
            imageIcon.getImage().getScaledInstance(jPanel1.getWidth(),
                jPanel1.getHeight(), Image.SCALE_DEFAULT));
        //Creamos un nuevo JLabel
        JLabel jLabel = new JLabel();
        //Le damos un tamaño
        jLabel.setSize(500, 500);
        //Le colocamos la imagen que tomamos
        jLabel.setIcon(icon);
        //Agregamos el Label al panel para mostrar el resultado
        jPanel1.add(jLabel);
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Take");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Take again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Pausamos la cámara para que parezca que tomamos la foto
        webcamPanel.pause();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Reconfiguro la cámara
        restartCamera(jPanel1, webcamPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Guardamos la foto
        takePicture();
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
            java.util.logging.Logger.getLogger(CameraTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CameraTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CameraTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CameraTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CameraTest().setVisible(true);
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
        /*Agregamos un nuevo layout a la ventana para acomodar los sobjetos, 
        puede ser cualquier tipo de Layout, pero para este caso utilizaremos
        BorderLayout*/
        setLayout(new BorderLayout());
        //Agregamos un WindowListener
        addWindowListener(this);
        /*Inicializamos la variable picker, para enlistar y seleccionar entre 
        las diferentes cámaras disponibles*/
        picker = new WebcamPicker();
        /*De igual forma, agregamos un "escuchador de items", para lograr que 
        nuestro seleccionador sea funcional*/
        picker.addItemListener(this);
        add(picker, BorderLayout.NORTH);
        add(jPanel1, BorderLayout.CENTER);
        add(jButton1, BorderLayout.EAST);
        add(jButton2, BorderLayout.WEST);
        add(jButton3, BorderLayout.SOUTH);
        //Terminamos la configuración de nuestra cámara
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
    public void windowOpened(WindowEvent we) {
        
    }

    @Override
    public void windowClosing(WindowEvent we) {
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }

    @Override
    public void uncaughtException(Thread thread, Throwable thrwbl) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getItem() != webcam) {
            //Si hay una cámara seleccionada
            if (webcam != null) {
                //Detener la cámara actual
                webcamPanel.stop();
                //Removemos el panel de cámara de nuestra interfaz
                remove(webcamPanel);
                //Removemos el escuchador y cerramos la cámara
                webcam.removeWebcamListener(this);
                webcam.close();
                //Inicializamos el objeto Webcam con la nueva cámara seleccionada
                webcam = (Webcam) ie.getItem();
                //Volvemos a configurar la cámara
                startCamera();
            }
        }
    }

    @Override
    public void webcamFound(WebcamDiscoveryEvent wde) {
        
    }

    @Override
    public void webcamGone(WebcamDiscoveryEvent wde) {
        
    }
}
