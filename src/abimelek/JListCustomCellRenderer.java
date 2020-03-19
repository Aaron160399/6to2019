/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abimelek;

import java.awt.Color;
import java.awt.Component;
import static javax.management.Query.value;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Avril
 */
public class JListCustomCellRenderer extends JLabel implements ListCellRenderer<Object> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> jlist, Object value, int index, boolean isSelected, boolean cellHasRenderer) {
        
        String s = value.toString();
        setText(s);
        setIcon(new ImageIcon(getClass().getResource("/img/closefolder.png")));
        if(isSelected){
            setBackground(Color.yellow);
            setBackground(Color.BLACK);
        }else{
            setBackground(Color.CYAN);
            setBackground(Color.LIGHT_GRAY);
            
            
        }
        setEnabled(jlist.isEnabled());
        setFont(jlist.getFont());
        setOpaque(true);
        return(this);
    }

   
    
}
