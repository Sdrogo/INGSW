/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Rum
 */
public class DocumentListner implements DocumentListener {

    @Override
    public void insertUpdate(DocumentEvent e) {
        GUI.Frame.setChanged(true);
      }

    @Override
    public void removeUpdate(DocumentEvent e) {
         GUI.Frame.setChanged(true);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
         GUI.Frame.setChanged(true);
    }
    
}
