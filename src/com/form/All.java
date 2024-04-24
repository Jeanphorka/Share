/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.form;

import com.model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Knomjean
 */
public class All extends javax.swing.JLayeredPane {

    private Chat chat;
    public All() {
        initComponents();
        init();
    }
    
    private void init() {
        setLayout(new MigLayout("fillx, filly", "1[248!]0[fill,100%]1", "0[fill]0"));
        this.add(new Contact());
        chat = new Chat();
        this.add(chat);
        chat.setVisible(false);
        
    }
    public void setUser(Model_User_Account user){
        chat.setUser(user);
        chat.setVisible(true);
    }
    
    public void updateUser(Model_User_Account user){
        chat.updateUser(user);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
