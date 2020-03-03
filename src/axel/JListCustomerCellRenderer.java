/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axel;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Bienvenido
 */
public class JListCustomerCellRenderer extends JLabel implements ListCellRenderer<Object>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> jlist, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String s=value.toString();
        setText(s);
        setIcon(new ImageIcon(getClass().getResource("/img/file.png")));
        if (isSelected) {
            setBackground(Color.red);
            setForeground(Color.cyan);
        }else{
            setBackground(Color.cyan);
            setForeground(Color.red);
        }
        setEnabled(jlist.isEnabled);
        setFont(jlist.getFont());
        setOpaque(true);
        return(this);
    }
    
}
