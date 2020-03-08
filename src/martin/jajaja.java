/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martin;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author MartinPC
 */
public class jajaja extends JLabel implements ListCellRenderer<Object> {

    public jajaja() {
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String s = value.toString();
        setText(s);
        setIcon(new ImageIcon(getClass().getResource("/img/file.png")));
        if (isSelected) {
            setBackground(Color.red);
            setForeground(Color.black);
        } else {
            setBackground(Color.white);
            setForeground(Color.black);
        }
        setEnabled(list.isEnabled());
        setOpaque(true);
        return this;
    }

}
