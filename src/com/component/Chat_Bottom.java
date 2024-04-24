/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.component;

import com.app.MessageType;
import com.client.Service;
import com.event.PublicEvent;
import com.model.Model_Send_Message;
import com.model.Model_User_Account;
import com.swing.JIMSendTextPane;
import com.swing.ScrollBar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Knomjean
 */
public class Chat_Bottom extends javax.swing.JPanel {

   
    public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
        panelMore.setUser(user);
    }

    private Model_User_Account user;
    
    public Chat_Bottom() {
        initComponents();
        init();
    }
    
    private void init(){
        //more button
        JPanel panel1 = new JPanel();
        panel1.setLayout(new MigLayout("filly","3[]3","0[bottom]0"));
        panel1.setBackground(new Color(207, 201, 231));
        JButton cmdMore = new JButton();
        cmdMore.setBorder(null);
        cmdMore.setContentAreaFilled(false);
        cmdMore.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdMore.setSize(20, 20);
        cmdMore.setIcon(new ImageIcon(getClass().getResource("/com/icon/more_dis.png")));
        cmdMore.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(panelMore.isVisible()){
                    cmdMore.setIcon(new ImageIcon(getClass().getResource("/com/icon/more_dis.png")));
                    panelMore.setVisible(false);
                    mig.setComponentConstraints(panelMore, "dock south, h 0!");
                    revalidate();
                }else{
                    cmdMore.setIcon(new ImageIcon(getClass().getResource("/com/icon/more.png")));
                    panelMore.setVisible(true);
                    mig.setComponentConstraints(panelMore, "dock south, h 170!");
                    revalidate();
                }
               
            }
            
        });
        panel1.add(cmdMore,"wrap");
        add(panel1);
        
        //message box 
        mig = new MigLayout("fillx, filly","5[]0[]5","5[fill]5[]0");
        setLayout(mig);
        setBackground(new Color(207, 201, 231));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.setFont(new java.awt.Font("Mitr Light", 0, 12));
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                refresh();
                if(ke.getKeyChar()== 10 && ke.isControlDown()){
                    eventSend(txt);
                }
            }
        });
        txt.setBorder(new EmptyBorder(5,5,5,5));
        scroll.setViewportView(txt);
        ScrollBar sb = new ScrollBar();
        sb.setBackground(new Color(207, 201, 231));
        sb.setPreferredSize(new Dimension(2,10));
        scroll.setVerticalScrollBar(sb);
        add(sb);
        add(scroll,"w 100%");
        
        //send button
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly","0[]0","0[bottom]0"));
        panel.setBackground(new Color(207, 201, 231));
        JButton cmd = new JButton();
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setSize(20, 20);
        cmd.setIcon(new ImageIcon(getClass().getResource("/com/icon/Send.png")));
        cmd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                eventSend(txt);
                
            }
            
        });
        panel.add(cmd);
        add(panel,"wrap");
        panelMore = new Panel_More();
        panelMore.setVisible(false);
        add(panelMore,"dock south , h 0!");
    }
    private void eventSend(JIMSendTextPane txt){
        String text = txt.getText().trim();
        if(!txt.equals("")){
                    Model_Send_Message message = new Model_Send_Message(MessageType.TEXT, Service.getInstance().getUser().getUserID(),user.getUserID(),text);
                    send(message);
                    PublicEvent.getInstance().getEvenChat().sendMessage(message);
                    txt.setText("");
                    txt.grabFocus();
                   refresh();
                }else{
                    txt.grabFocus();
                    
                }
    }
    private void send(Model_Send_Message data){
        Service.getInstance().getClient().emit("send_to_user", data.toJSONObject());
    }
    
    private void refresh(){
        revalidate();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(238, 238, 238));
        setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private MigLayout mig;
    private Panel_More panelMore;
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
