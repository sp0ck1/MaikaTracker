/*
 * Copyright (C) 2019 sg4e
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sg4e.maikatracker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import sg4e.ff4stats.fe.KeyItemLocation;

/**
 *
 * @author sg4e
 */
public class LocationPanel extends javax.swing.JPanel {
    
    private KeyItemLocation location;
    
    public static Color textColor = new Color(0,0,0);
    public static Color backgroundColor = new Color(240, 240, 240);

    /**
     * Creates new form LocationPanel
     */
    public LocationPanel() {
        initComponents();
    }
    
    public LocationPanel(KeyItemLocation loc) {
        this();
        location = loc;
        locationLabel.setText(loc.getLocation());
        locationLabel.setForeground(textColor);
        setBackground(backgroundColor);
    }
    
    public void setButtonEnabled(Boolean enabled) {
        checkedButton.setEnabled(enabled);
    }
    
    public void setButtonListener(ActionListener l) {
        checkedButton.addActionListener(l);
    }
    
    public KeyItemLocation getKeyItemLocation() {
        return location;
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(Integer.MAX_VALUE, getPreferredSize().height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locationLabel = new javax.swing.JLabel();
        checkedButton = new javax.swing.JButton();

        locationLabel.setText("jLabel1");
        add(locationLabel);

        checkedButton.setText("Checked!");
        add(checkedButton);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkedButton;
    private javax.swing.JLabel locationLabel;
    // End of variables declaration//GEN-END:variables
}
