/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author angel
 */
public class JListCustomCellRenderer extends JLabel implements ListCellRenderer <Object>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> jlist, Object e, int i, boolean bln, boolean bln1) {
    
        String s =value.toString();
        setText(s);
        setIcon(new ImageIcon());
    }
}