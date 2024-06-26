package com.component;

import com.model.Model_File_Sender;
import java.awt.Color;
import javax.swing.Icon;


public class Chat_Right extends javax.swing.JLayeredPane {

    public Chat_Right() {
        initComponents();
        txt.setBackground(new Color(201, 211, 255));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setTextRight(text);
        }
        txt.seen();

    }

    public void setImage(Model_File_Sender fileSender) {
        txt.setImage(true, fileSender);
    }

    public void setImage(Icon... image) {
//        txt.setImage(false,image);
    }

    public void setFile(String fileName, String fileSize) {
        txt.setFile(fileName, fileSize);
    }

    public void setEmoji(Icon icon) {
        txt.hideText();
        txt.setEmoji(true, icon);
    }

    public void setTime() {
        txt.setTime("10:30 PM");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.component.Chat_Item();

        setBackground(java.awt.Color.white);

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables

}
