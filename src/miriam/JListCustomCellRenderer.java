/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miriam;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author 52229
 */
public class JListCustomCellRenderer extends JLabel implements ListCellRenderer<Object>{
    
    public JListCustomCellRenderer() {
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String s=value.toString();
        setText(s);
        setIcon(new ImageIcon(getClass().getResource("/img/file.png")));
        if (isSelected) {
            setBackground(Color.cyan);
            setForeground(Color.blue);
        }else{
            setBackground(Color.magenta);
            setForeground(Color.red);
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return(this);
        
    }
    
}
