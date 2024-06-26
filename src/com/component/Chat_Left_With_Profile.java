

package com.component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author Knomjean
 */
public class Chat_Left_With_Profile extends javax.swing.JLayeredPane{

    /** Creates new form Chat_Left */
    public Chat_Left_With_Profile() {
        initComponents();
        txt.setBackground(new Color(66, 72, 116));
    }
    
    public void setImageProfile(Icon image){
        iaImage.setImage(image);
    }
    public  void setText(String text){
        if (text.equals("")){
            txt.hideText();
        }else{
            txt.setTextLeft(text);
            
            
        }
            
    }
    public void setImage(Icon... image){
//        txt.setImage(false,image);
    }
    
    public void setImage(String... image){
//        txt.setImage(false,image);
    }
    
    public void setFileleft(String fileName, String fileSize){
        txt.setFileleft(fileName,fileSize);
    }
    
    public void setTime(){
        txt.setTime("10:30 PM"); 
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        iaImage = new com.swing.ImageAvatar();
        txt = new com.component.Chat_Item();

        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(31, 31));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        iaImage.setBorderSize(0);
        iaImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/icon/people 1.png"))); // NOI18N
        iaImage.setMaximumSize(new java.awt.Dimension(40, 40));
        iaImage.setMinimumSize(new java.awt.Dimension(40, 40));
        iaImage.setPreferredSize(new java.awt.Dimension(40, 40));
        iaImage.setRequestFocusEnabled(false);

        jLayeredPane1.setLayer(iaImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iaImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(iaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.ImageAvatar iaImage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables

}
